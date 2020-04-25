package com.javarush.task.task14.task1408;

/**
 * Created by Sergey on 05.04.2017.
 */
public class RussianHen extends Hen {
    public int getCountOfEggsPerMonth() {
        return 11;
    }
    public String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA +
                ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
