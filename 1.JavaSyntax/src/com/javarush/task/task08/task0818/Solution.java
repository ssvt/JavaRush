package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> list = new HashMap<>();
        list.put("Pegusov", 240);
        list.put("Svyatoha", 2400);
        list.put("Chernov", 300);
        list.put("Pupkin", 600);
        list.put("Putin", 2000);
        list.put("Belov", 5000);
        list.put("Sokolov", 150);
        list.put("Voronav", 200);
        list.put("Golubkov", 600);
        list.put("Esenin", 500);
        return list;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> temp_map = new HashMap<>(map);
       for (Map.Entry<String,Integer> para : temp_map.entrySet())
       {
           String temp_name = para.getKey();
           Integer zarpl = para.getValue();
           if (zarpl < 500) map.remove(temp_name, zarpl);
       }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
     //   System.out.println(map);
        removeItemFromMap(map);
     //   System.out.println(map);

    }
}