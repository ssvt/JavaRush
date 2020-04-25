package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
       // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
        //    array[i] = Integer.parseInt(reader.readLine());
            array[i] = in.nextInt();
        }
             sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        for (int j = 0; j < 5; j++)
        {
            int max = array[j];
            int key_max = j;
            for (int i = j; i < array.length; i++)
            {
                if (max < array[i])
                {
                    max = array[i];
                    key_max = i;
                }
            }
            int temp = array[j];
            array[j] = max;
            array[key_max]= temp;
        }
    }
}
