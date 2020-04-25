package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; ; i++)
        {
            String str = in.nextLine();
            if ((str.compareTo("end"))== 0) break;
            else list.add(str);
        }
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}