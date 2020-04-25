package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Верона","Иван");
        map.put("Грачев","Руслан");
        map.put("Пегусов","Сергей");
        map.put("Соколов","Андрей");
        map.put("Горона","Андрей");
        map.put("Борон","Виталий");
        map.put("Даниленко","Юрий");
        map.put("Ворона","Павел");
        map.put("Леденев","Юрий");
        map.put("Харченко","Николай");
//
        return  map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int cnt = 0;

        for (Map.Entry pair : map.entrySet())
        {
            String nam = (String) pair.getValue();
            if (nam.equals(name)) cnt++;
        }
        return cnt;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        Integer count = 0;
        for (Map.Entry<String, String> pair: map.entrySet()){
            String familiya = pair.getKey();
            if (familiya.equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
     //   Map<String, String> list = createMap();
     //   System.out.println(createMap());
     //   System.out.println(getCountTheSameFirstName((HashMap<String, String>) list, "Ворона"));
     //   System.out.println(getCountTheSameLastName((HashMap<String, String>) list, "Юрий"));

    }
}
