package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();//напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int max = 0;                                //сюда запишем найденную максимальную длину
        for (int i = 0; i < 5; i++)                 // считываем строчки с клавы
        {
            list.add(in.nextLine());
        }
        max = list.get(0).length();              //изначально принимая  нудевую за самую длинную
        for (int i = 1; i < 5; i++)             // перебираем и ищем максимальную длину
        {
            if (list.get(i).length() > max)
            {
               max = list.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++)
        {
           if(list.get(i).length() == max ) System.out.println(list.get(i));
        }
    }
}
