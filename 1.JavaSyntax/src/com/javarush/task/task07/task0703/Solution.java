package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] mass = new String[10];
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 10; i++)
        {
            mass[i] = in.nextLine();
            array[i] = mass[i].length();
        }
        for(int i = 0;i < 10; i++)
        {
            System.out.println(array[i]);
        }
    }
}
