package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> list = new ArrayList<>();
        int[] mas5 =  {2,3,4,5,6};
        int[] mas2 = {33,45};
        int[] mas4 =  {37,41,5,60};
        int[] mas7=  {32,3,44,55,66,77,88};
        int[] mas0 =  {};
        list.add(mas5);
        list.add(mas2);
        list.add(mas4);
        list.add(mas7);
        list.add(mas0);
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
