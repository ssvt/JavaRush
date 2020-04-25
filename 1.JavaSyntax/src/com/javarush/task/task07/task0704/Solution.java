package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mas = new int[10];
        Scanner in = new Scanner(System.in);
        int temp;
        for(int i = 0; i < mas.length; i++)
        {
            mas[i] = in.nextInt();
        }
        for(int i = 0; i < 5; i++)
        {
            temp = mas[i];
            mas[i] = mas[9 -i];
            mas[9 -i] = temp;
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(mas[i]);
        }
    }
}

