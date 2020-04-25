package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        Scanner in_2 = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 0; i < n; i++){
            list.add(in_2.nextLine());
        }
        for(int i = 0; i < m; i++)
        {
            String str = list.get(0);
            list.add(str);
            list.remove(0);
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));

        //напишите тут ваш код
    }
}
