package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int min_longer;
        int max_longer;
        for (int i = 0; i < 10; i++)
        {
          list.add(in.nextLine());
        }
        max_longer = list.get(0).length();
        for (int i = 1; i < 10; i++)
        {
            if(list.get(i).length() >  max_longer)   max_longer = list.get(i).length();
        }

        min_longer = list.get(0).length();
        for (int i = 1; i < 10; i++)
        {
            if(list.get(i).length() <  min_longer)   min_longer = list.get(i).length();
        }
        for (int i = 0; i < 10; i++)
        {
            if(list.get(i).length() == max_longer) {
                System.out.println(list.get(i));
                break;
            }
            else if (list.get(i).length() == min_longer) {
                System.out.println(list.get(i));
                break;
            }

        }


    }
}
