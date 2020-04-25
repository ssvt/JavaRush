package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
    }

    public static void checkInterval(int a) {
        int b = a;
        if (b < 100 & b > 50) System.out.println("Число " + b + " содержится в интервале.");
        else System.out.println("Число " + b + " не содержится в интервале.");
    }
}