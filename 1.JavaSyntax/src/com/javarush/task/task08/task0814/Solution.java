package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> arr = new HashSet<>();
        for (int i = 0; i < 20; i++)
        {
            arr.add(i);
        }
        return arr;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        Integer temp = iterator.hashCode();
        while(iterator.hasNext())
        {
            temp = iterator.next();
            if (temp > 10) {
                set.remove(temp);
                iterator = set.iterator();
            }
        }
        return set;
    }

    public static void main(String[] args) {

    }
}
