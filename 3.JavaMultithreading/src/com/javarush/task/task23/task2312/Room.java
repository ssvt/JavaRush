package com.javarush.task.task23.task2312;

import java.awt.event.KeyEvent;

public class Room {
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
        game = this;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    /**
     * Основной цикл программы.
     * Тут происходят все важные действия
     */
    public void run() throws InterruptedException {
        //Создаем объект "наблюдатель за клавиатурой" и стартуем его.
        KeyboardObserver keyboardObserver = new KeyboardObserver();
        keyboardObserver.start();

        //пока змея жива
        while (snake.isAlive()) {
            //"наблюдатель" содержит события о нажатии клавиш?
            if (keyboardObserver.hasKeyEvents()) {
                KeyEvent event = keyboardObserver.getEventFromTop();
                //Если равно символу 'q' - выйти из игры.
                if (event.getKeyChar() == 'q') return;

                //Если "стрелка влево" - сдвинуть фигурку влево
                if (event.getKeyCode() == KeyEvent.VK_LEFT)
                    snake.setDirection(SnakeDirection.LEFT);
                    //Если "стрелка вправо" - сдвинуть фигурку вправо
                else if (event.getKeyCode() == KeyEvent.VK_RIGHT)
                    snake.setDirection(SnakeDirection.RIGHT);
                    //Если "стрелка вверх" - сдвинуть фигурку вверх
                else if (event.getKeyCode() == KeyEvent.VK_UP)
                    snake.setDirection(SnakeDirection.UP);
                    //Если "стрелка вниз" - сдвинуть фигурку вниз
                else if (event.getKeyCode() == KeyEvent.VK_DOWN)
                    snake.setDirection(SnakeDirection.DOWN);
            }

            snake.move();   //двигаем змею
            print();        //отображаем текущее состояние игры
            sleep();        //пауза между ходами
        }

        System.out.println("Game Over!");
    }

    public void print() {
        //Создаем массив, куда будем "рисовать" текущее состояние игры
        //Рисуем все кусочки змеи
        //Рисуем мышь
        //Выводим все это на экран
    }

    public void eatMouse() {
        createMouse();
    }

    public void createMouse() {
        int x = (int) (Math.random() * width);
        int y = (int) (Math.random() * height);

        mouse = new Mouse(x, y);
    }

    public static void main(String[] args)  throws InterruptedException{
        game = new Room(20, 20, new Snake(10, 10));
        game.snake.setDirection(SnakeDirection.DOWN);
        game.createMouse();
        game.run();
   /*     int paize = 1;
        for (int x = 1; x <= 20; x++){
            if (x == 1) paize = 500;
            if (x > 1 && x <= 11) paize = 500 - ((200 / 10) * (x - 1));
            if (x > 11 && x < 16) paize = 300 - ((100 / 5) * ((x-1) % 10));
            if (x >= 16) paize = 200;
            System.out.println("x = " + x + " : " + paize);
        }*/

    }


    public void sleep() throws InterruptedException {
        // делаем паузу, длинна которой зависит от длинны змеи
        int level = snake.getSections().size()  ;
        int pause = 200;
        if (level == 1) pause = 500;

        if (level > 1 && level <= 11) pause = 500 - ((200 / 10) * (level - 1));
        if (level > 11 && level < 16) pause = 300 - ((100 / 5) * ((level-1) % 10));
        if ( level >= 16) pause =200;
        Thread.sleep(pause);

    }
}