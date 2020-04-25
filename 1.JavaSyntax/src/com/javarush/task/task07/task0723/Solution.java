package com.javarush.task.task07.task0723;
//import java.lang.InterruptedException;
/* 
Обратный отсчёт
*/

public class Solution {
    public static void main(String[] args) {
        Thread th = new Thread();
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            try {
                // thread to sleep for 1000 milliseconds
                Thread.sleep(100);
            } catch (Exception e) {
                //System.out.println(e);
            }

        }

        System.out.println("Бум!");
    }
}
