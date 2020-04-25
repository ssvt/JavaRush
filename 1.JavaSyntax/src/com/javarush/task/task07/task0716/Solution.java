package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
           System.out.println(s);
       }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList <String> list1=new ArrayList <String> ();
        for(int i=0;i<list.size();i++)
        {
            boolean flag=true;
            String s=list.get(i);
            if (s.contains("р")) flag=false;
            if(s.contains("л"))
            {
                if (s.contains("р"))
                {
                    flag=true;
                }
                else {
                    list1.add(s);
                }
            }

            if (flag) list1.add(s);
        }
        return list1;
    }
}