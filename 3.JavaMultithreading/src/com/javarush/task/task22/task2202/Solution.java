package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String result = "";
        int start = 0;
        int end = 0;
        try {
            result = "";
            start = string.indexOf(" ") + 1;
            end = start - 1;
            for (int i = 0; i < 3; i++) {
                end = string.indexOf(" ", end + 1);
                if ((i < 3) && end == -1) throw new TooShortStringException(new Exception());
            }
            if (string.indexOf(" ", end + 1) != -1) {
                end = string.indexOf(" ", end + 1);
            } else {
                end = string.length();
            }
        } catch (Exception e) {
            throw new TooShortStringException(e);
        }

        return string.substring(start, end);
    }

    public static class TooShortStringException extends RuntimeException{
        public TooShortStringException (Throwable e){
            super(e);
        }
    }
}
