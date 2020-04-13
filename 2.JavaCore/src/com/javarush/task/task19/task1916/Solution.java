package com.javarush.task.task19.task1916;

import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = "";
        String file2 = "";
        try {
            file1 = reader.readLine();
            file2 = reader.readLine();
            reader.close();

            URL resource1 = Solution.class.getResource(file1);
            URL resource2 = Solution.class.getResource(file2);

            FileReader fileReader1 = new FileReader(Paths.get(resource1.toURI()).toFile());             // так не хавает валидатор  включить нижнюю
            FileReader fileReader2 = new FileReader(Paths.get(resource2.toURI()).toFile());

//            FileReader fileReader1 = new FileReader(file1);
//            FileReader fileReader2 = new FileReader(file2);

            BufferedReader reader1 = new BufferedReader(fileReader1);
            BufferedReader reader2 = new BufferedReader(fileReader2);
            String fileLine1;
            String fileLine2;
            List<String> lines1 = new ArrayList<String>();
            while ((fileLine1 = reader1.readLine()) != null) {
                lines1.add(fileLine1);
            }
            List<String> lines2 = new ArrayList<String>();
            while ((fileLine2 = reader2.readLine()) != null) {
                lines2.add(fileLine2);
            }

            fileReader1.close();
            fileReader1.close();
            reader1.close();
            reader2.close();
/**
 *    ***************  main logic  *********************************
 */
            for (int x = 0; x < lines1.size(); x++){
                if (lines1.size() >= lines2.size() ){                   //если в первом файле больше строк или так же
                    String ln1 = lines1.get(x);
                    String ln2 = "";
                    try {
                        ln2 = lines2.get(x);
                    }catch (IndexOutOfBoundsException e) {

                    }
                    if (ln1.equals(ln2)) {
                        LineItem lineItem = new LineItem(Type.SAME, ln1);
                        lines.add(lineItem);
                    }else{
                        LineItem lineItem = new LineItem(Type.REMOVED, ln1);
                        lines.add(lineItem);
                    }
                }

            }

/**
 * ********************************************************************
  */
            for (int x = 0; x < lines.size(); x++){
                System.out.println(lines.get(x).type + " " + lines.get(x).line);
            }
        } catch (IOException | URISyntaxException e) {
 //           System.out.println(" Ошибка ввода имени файла \n" + e.getLocalizedMessage() + "\n" + e.getMessage());
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
