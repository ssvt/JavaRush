package com.javarush.task.task08.task0820;

import java.util.*;

/* 
Множество всех животных
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        //напишите тут ваш код

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs_map = new HashSet<Dog>();//напишите тут ваш код
        dogs_map.add(new Dog());
        dogs_map.add(new Dog());
        dogs_map.add(new Dog());
        return dogs_map;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> result = new HashSet<Object>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);//напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object text : pets)
        {
            System.out.println(text);
        }
    }
    public static class Cat{
    }
    public static class Dog{
    }

}
