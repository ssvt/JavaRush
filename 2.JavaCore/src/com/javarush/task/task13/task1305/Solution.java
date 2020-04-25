package com.javarush.task.task13.task1305;

/* 
4 ошибки
*/

import static com.javarush.task.task13.task1305.Solution.Dream.HOBBIE;

public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Dream.HOBBIE.toString());
        System.out.println(Dream.HOBBIE);
    }
    interface Desire {
    }
    interface  Dream {
        Hobbie HOBBIE = new Hobbie();
    }
    static class Hobbie  implements Dream, Desire {
        static int INDEX = 1;
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
