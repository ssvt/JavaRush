package com.javarush.task.task07.task0707;

import java.util.ArrayList;
//import java.util.Scanner;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> ls = new ArrayList<String>();
        ls.add("abba");
        ls.add("mama");
        ls.add("babybox");
        ls.add("sergey");
        ls.add("pampers");
        System.out.println(ls.size());
        for (int i = 0; i < 5; i++)
        {
            System.out.println(ls.get(i));
        }
    }
}
