package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass20 = new int[20];
        int[] mass_1 = new int[10];
        int[] mass_2 = new int[10];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < 20; i++)
        {
            mass20[i] = in.nextInt();
        }
        for(int i = 0; i < 20; i++)
        {
            if (i < 10) mass_1[i] = mass20[i];
            else mass_2[i-10] = mass20[i];
        }
        for(int i = 0; i < 10; i++)
        {
            System.out.println(mass_2[i]);
        }
    }
}
