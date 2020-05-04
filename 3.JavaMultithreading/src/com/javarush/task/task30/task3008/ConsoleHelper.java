package com.javarush.task.task30.task3008;

import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){ System.out.println(message); }

    
    public static String readString()  {
        while (true){
            try {
                return   bufferedReader.readLine();
            } catch (IOException e) { System.out.println("Неккоректный ввод..!!! Введите еще раз"); }
        }

    }
    public static int readInt()  {
        while (true){
            try {
                return Integer.parseInt(readString());
            }catch (NumberFormatException e){ System.out.println("Вы ввели не число..!! Введите еще раз"); }
        }
    }
}
