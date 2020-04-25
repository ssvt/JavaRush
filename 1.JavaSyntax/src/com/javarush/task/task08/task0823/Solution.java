package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] ch = s.toCharArray();                        // создаем из введенной строки массив из символов
        for(int i = 0; i < ch.length; i++)                  // перебираем весь массив
        {
            if(i == 0 && Character.isLetter(ch[i]))     // Если первый символ буква
                ch[i] = Character.toUpperCase(ch[i]);
            else if(i != 0 && Character.isSpaceChar(ch[i-1]) && Character.isLetter(ch[i]))
                ch[i] = Character.toUpperCase(ch[i]);
        }
        s = String.copyValueOf(ch);
        System.out.println(s);
    }
}
