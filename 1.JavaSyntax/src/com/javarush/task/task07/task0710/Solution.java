package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        Scanner in = new Scanner(System.in);
        String str;
        for (int i = 0; i < 10; i++)
        {
           /* for (int y = 0; y < 10; y++)
            {
                list.set(9 - y , list.get(8 - y));
            }*/
            str = in.nextLine();
            list.add(0, str);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
