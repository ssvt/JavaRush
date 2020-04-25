package com.javarush.task.task18.task1802;

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
        int min = file.read() ;
        while (file.available()>0) {
            int reading_byte = file.read();
            if (reading_byte < min) min = reading_byte;
        }
        file.close();
        System.out.println(min);
    }
}
