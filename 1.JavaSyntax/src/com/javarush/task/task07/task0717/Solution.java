package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();// Считать строки с консоли и объявить ArrayList list тут
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            list.add(in.nextLine());
        }
        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < result.size(); i++)
            System.out.println(result.get(i));

    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> list_temp = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++)
        {
            String str = list.get(i);
            list_temp.add(str);
            list_temp.add(str);
        }
        return list_temp;
    }
}
