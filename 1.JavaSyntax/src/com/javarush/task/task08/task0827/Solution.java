package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("MAY 1 2013"));
       // System.out.println(isDateOdd("JANUARY 1 2000"));
       // System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) throws ParseException {
        boolean result;
        SimpleDateFormat format = new SimpleDateFormat("MMM dd yyyy" , Locale.US);
        Date date_end = format.parse(date);

        Date date_start = new Date();
        date_start.setYear(date_end.getYear());
        date_start.setMonth(0);
        date_start.setDate(1);
        date_start.setHours(0);
        date_start.setMinutes(0);
        date_start.setSeconds(0);
        date_end.setHours(23);
        date_end.setMinutes(59);
        date_end.setSeconds(59);
        long msDistance = date_end.getTime() - date_start.getTime();
        long msDay = 24 * 60 * 60 * 1000;                           //сколько миллисекунд в одних сутках
        int dayCount = (int) (msDistance/msDay);                    //количество целых дней
        if (dayCount % 2 == 0 ) result = true;
        else  result = false;
      //  System.out.println(date_start);
      //  System.out.println(date_end);
      //  System.out.printf("милисекунды : %d дни : %d  const: %d ",msDistance,dayCount,msDay);
        return result;
    }
}
