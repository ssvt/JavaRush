package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) System.out.println("понедельник");
        if (i == 2) System.out.println("вторник");
        if (i == 3) System.out.println("среда");
        if (i == 4) System.out.println("четверг");
        if (i == 5) System.out.println("пятница");
        if (i == 6) System.out.println("суббота");
        if (i == 7) System.out.println("воскресенье");
        if (i < 1 | i >7) System.out.println("такого дня недели не существует"); //напишите тут ваш код
    }
}