package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.SyncFailedException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++ )
        {
            list.add(in.nextLine());
        }
        list.remove(2);

        for (int i = 0; i < 4; i++)
        {
            String str = list.get(4-i-1);
            System.out.println(str);
        }

    }
}


