package com.javarush.task.task08.task0819;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        printCats(cats);
        cats.remove(cats);
        printCats(cats);
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cat = new HashSet<>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());//напишите тут ваш код. step 2 - пункт 2
        return cat;
    }

    public static void printCats(Set<Cat> cats)
    {
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext())
        {
            Cat cat = iterator.next();
            System.out.println(cat);
        }
    }
    public static class Cat {

    }
}
