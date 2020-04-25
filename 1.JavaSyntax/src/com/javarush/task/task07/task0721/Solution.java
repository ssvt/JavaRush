package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //   BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Scanner in = new Scanner(System.in);
        int[] mass = new int[20];
        int maximum;
        int minimum;

        for (int i = 0; i < 20; i++) {
            mass[i] = in.nextInt();
        }
        minimum = mass[0];
        maximum = mass[0];
        for (int i = 1; i < 20; i++) {
            if (mass[i] < minimum) minimum = mass[i];
            if (mass[i] > maximum) maximum = mass[i];
        }

        System.out.print(maximum);
        System.out.print(" ");
        System.out.print(minimum);
    }
}