package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String,Cat> map=new HashMap<String,Cat>();
        map.put("cat1",new Cat("cat1"));
        map.put("cat2",new Cat("cat2"));
        map.put("cat3",new Cat("cat3"));
        map.put("cat4",new Cat("cat4"));
        map.put("cat5",new Cat("cat5"));
        map.put("cat6",new Cat("cat6"));
        map.put("cat7",new Cat("cat7"));
        map.put("cat8",new Cat("cat8"));
        map.put("cat9",new Cat("cat9"));
        map.put("cat10",new Cat("cat10"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> stm = new HashSet<>();
        for (Map.Entry<String,Cat> pair:map.entrySet()) {
            stm.add(pair.getValue());
        }
        return stm;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
