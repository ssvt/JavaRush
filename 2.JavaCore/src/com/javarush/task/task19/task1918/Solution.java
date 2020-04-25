package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String teg = args[0];
        String openTeg = "<" + teg;
        String closeTeg = "</" + teg + ">";
        BufferedReader consoleReader = new BufferedReader(new  InputStreamReader(System.in));
        FileReader reader = new FileReader(consoleReader.readLine());
        BufferedReader fileReader = new BufferedReader(reader);
        StringBuilder stringBuilder = new StringBuilder();
        while (fileReader.ready()) stringBuilder.append(fileReader.readLine());

        String allText = String.valueOf(stringBuilder);

        LinkedList<Integer> openQueue = new LinkedList<>();                      // Очередь для ожидающих закрытия тегов, запоминаем все открытые
        LinkedList<String> tempQueque = new LinkedList<>();                      // Очередь для ожидающих вывода строк (очередь-2)
        for (int i = 0; i <= allText.length() - closeTeg.length(); i++ ){
            if (allText.substring(i).startsWith(openTeg)) openQueue.addFirst(i); // Записываем индекс открывающегося тега в очередь первым элементом
            if (allText.substring(i).startsWith(closeTeg)){                     // Если встретили закрывающися тег, то:
                tempQueque.add(allText.substring(openQueue.removeFirst(), i + closeTeg.length())); // Берем из очереди последний открывающийся тег и заносим в очередь-2
                if (openQueue.isEmpty()) while (!tempQueque.isEmpty()) System.out.println(tempQueque.removeLast());// Если в очереди тегов закончилисm открывающиеся, начинаем выводить на печать из очереди-2
            }
        }

        fileReader.close();
        reader.close();
        consoleReader.close();
    }
}
