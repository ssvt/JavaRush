package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] tmp = new char[s.length()];
        tmp = s.toCharArray();
        ArrayList list = new ArrayList();
        for (int i = 0; i < s.length(); i ++) {
            list.add(tmp[i]);
        }
        list.add("\n");
        for (int i = 0; i < 40; i++)
        {
            for (int y = 0; y < list.size(); y++ )
            {
                System.out.print(list.get(y));
            }
           list.remove(0);


        }
    }

}

