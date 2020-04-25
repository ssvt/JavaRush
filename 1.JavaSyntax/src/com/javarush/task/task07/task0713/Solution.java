package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> ar_3 = new ArrayList<Integer>();
        ArrayList<Integer> ar_2 = new ArrayList<Integer>();
        ArrayList<Integer> last = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 20; i++)
        {
            list.add(Integer.parseInt(in.nextLine()));
        }
            for (int i = 0; i < 20; i++)
            {
                if(list.get(i) % 3 == 0 && list.get(i) % 2 == 0)
                {
                    ar_3.add(list.get(i));
                    ar_2.add(list.get(i));
                }
                else    if (list.get(i) % 2 == 0) ar_2.add(list.get(i));
                        else    if (list.get(i) % 3 == 0) ar_3.add(list.get(i));
                                else last.add(list.get(i));
            }
            printList(ar_3);
            printList(ar_2);
            printList(last);



    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
