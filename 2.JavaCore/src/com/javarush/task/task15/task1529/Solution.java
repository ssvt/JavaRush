package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static Flyable result;

    public static void reset() {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        if (str.contains("helicopter")) result = new Helicopter();
        else if (str.contains("plane")) result = new Plane();
    }
}
