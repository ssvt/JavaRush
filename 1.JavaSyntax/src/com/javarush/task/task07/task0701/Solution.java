package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] massiv = new int[20]; // создай и заполни массив
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < massiv.length; i++ )
        {
            massiv[i] = in.nextInt();
        }
        return massiv;
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++ )
        {
            if(array[i] > max) max = array[i];
        }// найди максимальное значение
        return max;
    }
}
