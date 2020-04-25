package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        return a + b;
        //return 0;
    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        double c=((double)a)/(double)b;//напишите тут ваш код
        return c;
    }

    public static double percent(int a, int b) {
        double c=((double)a/100)*(double)b;//напишите тут ваш код
        return c;
    }

    public static void main(String[] args) {

    }
}