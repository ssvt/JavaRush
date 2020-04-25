package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
    public static class Goose extends SmallAnimal{
        public String getSize(){
            String str ;
            str = "Гусь маленький, " +  super.getSize();
            return str;
        }
    }
    public static class Dragon extends BigAnimal {
        public String getSize(){
            String str ;
            str = "Дракон большой, " +  super.getSize();
            return str;
        }
    }//добавьте классы Goose и Dragon тут

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }


}
