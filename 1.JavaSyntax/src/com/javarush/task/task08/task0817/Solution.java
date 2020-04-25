package com.javarush.task.task08.task0817;

//import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Stallone", "Sergey");
        map.put("Svarchneger", "Arnold");
        map.put("Pegus", "Sergey");
        map.put("Svyat", "Sergey");
        map.put("Vorona", "Vitaly");
        map.put("Jat Lee", "Lee");
        map.put("Kornet", "Andrey");
        map.put("PUTIN", "Volodimir");
        map.put("Polskoy", "Dimon");
        map.put("Plotnitskiy", "Andrey");
        return  map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> map_copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : map_copy.entrySet()) {
            int i = 0;
            for (Map.Entry<String, String> pair2 : map_copy.entrySet()) {
                if (pair2.getValue().equals(pair.getValue()))
                    i++;
                if (i > 1) removeItemFromMapByValue(map, pair.getValue());
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
     //   System.out.println(map);
        removeTheFirstNameDuplicates(map);
     //   System.out.print(map);

    }
}
