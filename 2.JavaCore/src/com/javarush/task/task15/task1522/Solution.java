package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String text = br.readLine();
            if (text.equals(Planet.SUN))
                thePlanet = Sun.getInstance();
            else if (text.equals(Planet.EARTH))
                thePlanet = Earth.getInstance();
            else if (text.equals(Planet.MOON))
                thePlanet = Moon.getInstance();
            else thePlanet = null;
        }
        catch (IOException e)
        {}
    }
}
