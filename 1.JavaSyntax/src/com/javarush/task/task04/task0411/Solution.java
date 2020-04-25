package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if (month == 1) System.out.println("зима");
        if (month == 2) System.out.println("зима");
        if (month == 3) System.out.println("весна");
        if (month == 4) System.out.println("весна");
        if (month == 5) System.out.println("весна");
        if (month == 6) System.out.println("лето");
        if (month == 7) System.out.println("лето");
        if (month == 8) System.out.println("лето");
        if (month == 9) System.out.println("осень");
        if (month == 10) System.out.println("осень");
        if (month == 11) System.out.println("осень");
        if (month == 12) System.out.println("зима");
    }
}