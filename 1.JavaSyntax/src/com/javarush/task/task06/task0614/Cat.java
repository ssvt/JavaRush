package com.javarush.task.task06.task0614;

import java.util.ArrayList;

/* 
Статические коты
*/

public class Cat {
    public static ArrayList<Cat> cats;

    public Cat() {
        cats.add(this);
    }

    public static void main(String[] args) {
        cats = new ArrayList<Cat>();
        for (int i = 0; i < 10; i++)
        {
            Cat cat = new Cat();
        }//напишите тут ваш код
        printCats();
    }

    public static void printCats() {
        for (int i = 0; i < cats.size(); i++)
        {
            System.out.println(cats.get(i));
        }//напишите тут ваш код
    }
}
