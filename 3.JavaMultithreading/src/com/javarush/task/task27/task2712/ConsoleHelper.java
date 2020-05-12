package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *  07.05 вернулся к хадаче через пол года
 */
public class ConsoleHelper {
    private static  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message){ System.out.println(message); }

    public static String readString() throws IOException { return bufferedReader.readLine(); }

    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> listDish = new ArrayList<>();
        writeMessage("Выберите блюда. Для завершения наберите 'exit'.");
        writeMessage(Dish.allDishesToString());

        while (true) {
            String dishToOrder = readString();
            if (dishToOrder.equalsIgnoreCase("exit")) {
                break;
            }
            if(dishToOrder.isEmpty()){
                writeMessage("Блюдо не выбрано");
                continue;
            }
            boolean found = false;
            for(Dish d : Dish.values())
                if(d.name().equalsIgnoreCase(dishToOrder)) {
                    listDish.add(d);
                    found = true;
                }
            if(!found){
                writeMessage("Нет такого блюда");
            }
        }

        return listDish;
    }
}
