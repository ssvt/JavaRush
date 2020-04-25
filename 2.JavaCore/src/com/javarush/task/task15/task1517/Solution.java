package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

import jdk.nashorn.internal.objects.NativeArguments;

import java.lang.annotation.Native;

public class Solution {
    public static int A = 0;

    static {
        //throw an exception here - выбросьте эксепшн ту
        if (true)throw new RuntimeException();
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
