package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader klava = new BufferedReader(new InputStreamReader(System.in));
        String s = klava.readLine();
        int i = Integer.parseInt(s);
        int x;
        if (i%4==0 & i%100!=0) {
            x = 366;
            System.out.println("количество дней в году: " + x);
        }
        else {
            x = 365;
            System.out.println("количество дней в году: " + x);//напишите тут ваш код
        }
    }
}