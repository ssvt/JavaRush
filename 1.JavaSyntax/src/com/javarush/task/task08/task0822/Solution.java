package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/*
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        Integer min = array.get(0);
        for (int i = 1; i < array.size(); i ++)
        {
            if (min > array.get(i)) min = array.get(i);
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        Integer N = in.nextInt();
        for (int i = 0; i < N; i++)
        {
            list.add(in.nextInt());
        }
        return list;
    }
}
