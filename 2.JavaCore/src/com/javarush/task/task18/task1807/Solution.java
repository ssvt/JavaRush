package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String file = read.readLine();
        FileInputStream in = new FileInputStream(file);
        int count = 0;
        while (in.available() > 0) {
            int temp = in.read();
            if (temp == 44) count++;
        }
        System.out.println(count);
        in.close();
    }
}
