package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String[] arr = getTokens("level22.lesson13.task01",".");
    }
    public static String [] getTokens(String query, String delimiter) {
        ArrayList<String> list = new ArrayList<>();
        StringTokenizer token = new StringTokenizer(query,delimiter);
        while (token.hasMoreTokens()){
            list.add(token.nextToken());
        }
        return list.toArray(new String[list.size()]);
    }
}
