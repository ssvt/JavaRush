package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики 1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static {
        labels.put(2.4 , "first");
        labels.put(1.2, "two");
        labels.put(3.3 , "three");
        labels.put(4.4, "two");
        labels.put(5.5, "five");

    }

    public static void main(String[] args) {

        System.out.println(labels);
    }
}
