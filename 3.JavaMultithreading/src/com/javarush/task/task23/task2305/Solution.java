package com.javarush.task.task23.task2305;

/* 
Inner
*/
public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution[] out = new Solution[2];
        for (int x = 0; x < 2; x++){
            out[x] = new Solution();
            out[x].innerClasses[0] = out[x].new InnerClass();
            out[x].innerClasses[1] = out[x].new InnerClass();
        }

        return out;
    }

    public static void main(String[] args) {

    }
}
