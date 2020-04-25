package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String str;
        for (int i = 0; i < 5; i++)
        {
            str = in.nextLine();
            list.add(str);
        }
        for (int i = 0; i < 13; i ++)
        {
            str = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,str);
        }
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
