package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ( a == b && a ==c) System.out.println(a + " " + b + " " + c);
        else
        {
            if (a == b) System.out.println(a + " " + b);
            if (a == c) System.out.println(a + " " + c);
            if (b == c) System.out.println(b + " " + c);
        }

    }
}