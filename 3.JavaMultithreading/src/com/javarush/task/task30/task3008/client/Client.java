package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    public class SocketThread extends Thread{
        public void run(){
            String host = getServerAddress();
            int port = getServerPort();

            try {
                Socket socket = new Socket(host, port);
                Client.this.connection = new Connection(socket);

                clientHandshake();

                clientMainLoop();

            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        }

        protected void processIncomingMessage(String message){
            ConsoleHelper.writeMessage(message);
        }

        protected void informAboutAddingNewUser(String userName){
            ConsoleHelper.writeMessage(userName + " присоединился к чату");
        }

        protected void informAboutDeletingNewUser(String userName){
            ConsoleHelper.writeMessage(userName + " покинул чат");
        }

        protected void notifyConnectionStatusChanged(boolean clientConnected){
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this){
                Client.this.notify();
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {

            while(true){
                Message message = connection.receive();

                if (message.getType() == MessageType.NAME_REQUEST){
                    String clientName = getUserName();
                    connection.send(new Message(MessageType.USER_NAME, clientName));
                }
                else if (message.getType() == MessageType.NAME_ACCEPTED){
                    notifyConnectionStatusChanged(true);
                    break;
                }
                else throw new IOException("Unexpected MessageType");
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {

            while (true){
                Message message = connection.receive();

                if (message.getType() == MessageType.TEXT){
                    processIncomingMessage(message.getData());
                }
                else if (message.getType() == MessageType.USER_ADDED){
                    informAboutAddingNewUser(message.getData());
                }
                else if (message.getType() == MessageType.USER_REMOVED){
                    informAboutDeletingNewUser(message.getData());

                }
                else throw new IOException("Unexpected MessageType");
            }

        }
    }

    public void run(){
        // Создавать новый сокетный поток с помощью метода getSocketThread.
        SocketThread socketThread = getSocketThread();

        // Помечать созданный поток как daemon, это нужно для того,
        // чтобы при выходе из программы вспомогательный поток прервался автоматически.
        socketThread.setDaemon(true);

        // Запустить вспомогательный поток.
        socketThread.start();

        // Заставить текущий поток ожидать, пока он не получит нотификацию из другого потока.
        synchronized (this) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                ConsoleHelper.writeMessage("Выход из программы по ошибке.");
            }
        }

        //проверь значение clientConnected
        if (clientConnected)
            ConsoleHelper.writeMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
        else
            ConsoleHelper.writeMessage("Произошла ошибка во время работы клиента.");

        // Считывай сообщения с консоли пока клиент подключен.
        while (clientConnected){
            String text = ConsoleHelper.readString();
            // Если будет введена команда ‘exit‘, то выйди из цикла.
            if (text.toLowerCase().equals("exit")) break;

            // После каждого считывания, если метод shouldSendTextFromConsole() возвращает true,
            // отправь считанный текст с помощью метода sendTextMessage().
            if (shouldSendTextFromConsole())
                sendTextMessage(text);
        }
    }

    protected String getServerAddress(){
        ConsoleHelper.writeMessage("Введите адрес сервера: ");
        return ConsoleHelper.readString();
    }

    protected int getServerPort(){
        ConsoleHelper.writeMessage("Введите порт сервера: ");
        return ConsoleHelper.readInt();
    }

    protected String getUserName(){
        ConsoleHelper.writeMessage("Введите имя пользователя: ");
        return ConsoleHelper.readString();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            ConsoleHelper.writeMessage("Ошибка при отправке сообщения. Соединение будет закрыто.");
            clientConnected = false;
        }
    }
}
