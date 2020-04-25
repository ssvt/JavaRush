package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replace(" ", "");
        char[] array = str.toCharArray();
        String glasn = "";
        String sogl = "";
        for (int i = 0; i < array.length; i++) {
            if (isVowel(array[i])) glasn = glasn + array[i] + " ";
            else sogl = sogl + array[i] + " ";
        }
        System.out.println(glasn);
        System.out.println(sogl);
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}