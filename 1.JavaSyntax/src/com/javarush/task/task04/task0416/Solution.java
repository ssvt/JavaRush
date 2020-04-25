package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        x = x % 5;
        if (0 <= x && x < 3) System.out.println("зелёный");
        else if (3 <= x && x < 4) System.out.println("желтый");
        else if (4 <= x && x < 5) System.out.println("красный");


    }
}