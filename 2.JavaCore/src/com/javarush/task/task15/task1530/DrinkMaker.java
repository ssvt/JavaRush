package com.javarush.task.task15.task1530;

/**
 * Created by Sergey on 16.04.2017.
 */
public abstract class DrinkMaker {
 public abstract void getRightCup();
 public abstract void putIngredient();
 public abstract void pour();
 public void makeDrink(){
     getRightCup();
     putIngredient();
     pour();
 }
}
