package com.javarush.task.task06.task0606;

import java.io.*;
import java.util.Scanner;
/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int ost;
        do{
            ost = x % 10;
            x = x / 10;
            if (ost % 2 == 0) even = even + 1;
            else odd = odd +1;

        }while (x >= 1);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
