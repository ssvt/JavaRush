package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {

        if (telNumber == null) return false;
        if (telNumber.isEmpty()) return false;
        int digits = telNumber.replaceAll("\\D", "").length();
        if ((telNumber.charAt(0) == '+' && digits == 12) || (telNumber.charAt(0) != '+' && digits == 10)) {
            return telNumber.matches("(\\+\\d+)?\\d*(\\(\\d{3}\\))?\\d+(-?\\d+){0,2}");
        }
        else return false;
    }

    public static void main(String[] args) {

    }
}
