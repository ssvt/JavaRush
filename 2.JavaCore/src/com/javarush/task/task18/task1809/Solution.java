package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String in_file = reader.readLine();
        String out_file = reader.readLine();
        FileInputStream file1 = new FileInputStream(in_file);
        FileOutputStream file2 = new FileOutputStream(out_file);
        ArrayList<Integer> list = new ArrayList<>();
        while (file1.available()>0){
            list.add(file1.read());
        }

        for (int i = list.size()-1;i>=0;i--)
        {
            file2.write(list.get(i));
        }
        reader.close();
        file1.close();
        file2.close();
    }
}
