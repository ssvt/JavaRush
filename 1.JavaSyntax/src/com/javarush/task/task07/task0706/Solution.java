package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] mass = new int[15];
        int sum_chet = 0;
        int sum_nech = 0;
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 15; i++)
        {
            mass[i] = in.nextInt();
        }
        for (int i = 0; i < 15; i++)
        {
            if ((i%2 == 0)||(i == 0))   // chet
            {
                sum_chet = sum_chet + mass[i];
            }
            else
                sum_nech = sum_nech + mass[i];
        }
        if (sum_chet > sum_nech) System.out.println("В домах с четными номерами проживает больше жителей.");
        else System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}
