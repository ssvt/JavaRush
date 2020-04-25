package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String[] url = r.readLine().split("[?&]");
        String str="";

        for (int i = 1; i < url.length; i++)
        {
            if(url[i].contains("="))
                str+=url[i].substring(0, url[i].indexOf("="))+" ";
            else
                str+=url[i]+" ";
        }
        str=str.trim();
        System.out.print(str.replaceAll("[\\s]{2,}", " "));
        System.out.println();
        for (int i = 0; i < url.length; i++) //передаем значение(-я) параметра obj в метод alert
        {
            try{ if (url[i].length()>0 && url[i].substring(0, url[i].indexOf("=")).equals("obj"))
            {
                try
                {
                    alert(Double.parseDouble((url[i].substring(url[i].indexOf("=") + 1, url[i].length()))));
                }
                catch (Exception e)
                {
                    alert((url[i].substring(url[i].indexOf("=") + 1, url[i].length())));
                }
            }

            } catch (Exception e){}
        }
    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}