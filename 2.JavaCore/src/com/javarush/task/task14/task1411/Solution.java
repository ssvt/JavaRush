package com.javarush.task.task14.task1411;

import com.javarush.task.task14.task1411.Person.Coder;
import com.javarush.task.task14.task1411.Person.Proger;
import com.javarush.task.task14.task1411.Person.User;
import com.javarush.task.task14.task1411.Person.Loser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;
        ArrayList<String> list = new ArrayList<>();
        list.add("user");
        list.add("loser");
        list.add("coder");
        list.add("proger");

        //while (list.equals(reader.readLine()))//тут цикл по чтению ключей, пункт 1
        do{
            key = reader.readLine();
            //System.out.println(key);
            if (list.contains(key)){
                if(key.contains("user")) {
                    person = new User(); //создаем объект, пункт 2
                    doWork(person); //вызываем doWork
                }
                if(key.contains("loser")) {
                    person = new Loser(); //создаем объект, пункт 2
                    doWork(person); //вызываем doWork
                }
                if(key.contains("coder")) {
                    person = new Coder(); //создаем объект, пункт 2
                    doWork(person); //вызываем doWork
                }
                if(key.contains("proger")) {
                    person = new Proger(); //создаем объект, пункт 2
                    doWork(person); //вызываем doWork
                }
            }
        }while (list.contains(key));
    }

    public static void doWork(Person person) {
        if (person instanceof User) {
            ((User) person).live();
        }
        if (person instanceof Loser) {
            ((Loser) person).doNothing();
        }
        if (person instanceof Coder) {
            ((Coder) person).coding();
        }
        if (person instanceof Proger) {
            ((Proger) person).enjoy();
        }
    }
}
