package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> map = new HashMap<>();
        map.put("Чернов", "Олег");
        map.put("Бубнов", "Андрей");
        map.put("Чернов", "Павел");
        map.put("Воронов", "Игорь");
        map.put("Чубайс", "Евгений");
        map.put("Путин", "Сергей");
        map.put("Даниленко", "Игорь");
        map.put("Хворостов", "Руслан");
        map.put("Игнатов", "Игорь");
        map.put("Ушкац", "Олег");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
