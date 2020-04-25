package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.*;

/* 
Сортировка байт
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

        Set<Byte> out_buf = new HashSet<Byte>();
        for(int i = 0; i < bufer.length; i ++){
            out_buf.add(bufer[i]);
        }
        TreeSet out = new TreeSet();
        out.addAll(out_buf);
        Iterator iterator = out.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
