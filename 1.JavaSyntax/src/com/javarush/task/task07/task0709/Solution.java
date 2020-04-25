package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stroki = new ArrayList<String>();     //напишите тут ваш код
        Scanner in = new Scanner(System.in);
        int min = 0;                                //сюда запишем найденную максимальную длину
        for (int i = 0; i < 5; i++)                 // считываем строчки с клавы
        {
            stroki.add(in.nextLine());
        }
        min = stroki.get(0).length();              //изначально принимая  нудевую за самую длинную
        for (int i = 1; i < 5; i++)             // перебираем и ищем максимальную длину
        {
            if (stroki.get(i).length() < min)
            {
                min = stroki.get(i).length();
            }
        }
        for (int i = 0; i < 5; i++)
        {
            if(stroki.get(i).length() == min ) System.out.println(stroki.get(i));
        }
    }
}
