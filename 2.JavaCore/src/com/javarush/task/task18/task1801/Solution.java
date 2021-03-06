package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        FileInputStream file = new FileInputStream(str);
        int max = 0 ;
        while (file.available()>0) {
            int reading_byte = file.read();
            if (reading_byte > max) max = reading_byte;
        }
        file.close();
        System.out.println(max);
    }
}
