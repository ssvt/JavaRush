package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();                       //читаем из консоли название файла
        //String str = "d:\\1.txt";
        FileInputStream file = new FileInputStream(str);
        HashMap<Byte,Integer> map = new HashMap();
        byte[] bufer = new byte[file.available()];              //резервируем массив байт по длине файла
        file.read(bufer,0, file.available());               //переносим содержимое файла в массив байт
        file.close();

        for (int i = 0; i < bufer.length; i++){                 //переносим из обычного массива в мап с присвоением колличесва повтором
            if (!map.containsKey(bufer[i])){
                map.put(bufer[i],1);
            }else{
                int count  = map.get(bufer[i]);
                count++;
                map.put(bufer[i],count);
            }
        }
        int max_value = 0;                                      // ищем максимальное колличество повторов байт
        for (HashMap.Entry<Byte, Integer> y: map.entrySet()){
            if (y.getValue() > max_value) {
                max_value = y.getValue();
            }
        }
        for (HashMap.Entry<Byte, Integer> y: map.entrySet()){
            if (y.getValue() == max_value) {
                System.out.print(y.getKey() + " ");
            }
        }
    }
}
