package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUN 1 1980"));
        map.put("Svarchneger", new Date("MAR 23 1956"));
        map.put("Pegus", new Date("AUG 20 1956"));
        map.put("Svyat", new Date("APR 7 1978"));
        map.put("Vorona", new Date("JUL 23 1984"));
        map.put("Jat Lee", new Date("JUN 1 1980"));
        map.put("Kornet", new Date("NOV 14 1976"));
        map.put("PUTIN", new Date("AUG 20 1986"));
        map.put("Polskoy", new Date("APR 7 1988"));
        map.put("Plotnitskiy", new Date("JUL 23 1974"));
        return  map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String,Date>> iterator= map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Date> para = iterator.next();
            if (para.getValue().getMonth()>4 && para.getValue().getMonth()<8){iterator.remove();}
        }

    }

    public static void main(String[] args) {
        HashMap<String, Date> map = new HashMap();
        map = createMap();
        removeAllSummerPeople(map);
        //System.out.println(map);

    }
}
