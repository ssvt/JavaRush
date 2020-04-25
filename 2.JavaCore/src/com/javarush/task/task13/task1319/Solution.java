package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.Scanner;

/*
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        boolean repeat = true;
        while (repeat)
        {
            String str = reader.readLine();
            if (str.equals("exit")) {
                repeat = false;
            }
            str += "\n";
            char[] buffer = str.toCharArray();
            writer.write(buffer);
            writer.flush();
        }
        writer.close();
        reader.close();
    }


}
