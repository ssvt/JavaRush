package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        String path = args[0];
        String resultFileAbsolutePath = args[1];

        File fileOld = new File(resultFileAbsolutePath);                            // это абсолютный путь к старому названию файла
        String pathToFile = fileOld.getParentFile().toString();                     // сохраняем отдельно путь к этому файлу

        String newFilePath = pathToFile + File.separator + "allFilesContent.txt";   // переименовываем файл с сохранением пути к нему

        File fileNew = new File(newFilePath);
        if ( FileUtils.isExist(fileOld) ) FileUtils.renameFile(fileOld, fileNew);
        else {
            try {
                fileNew.createNewFile();
            } catch (IOException e) { e.printStackTrace(); }
        }

        final File folder = new File(path);
        Map<String, String> list = FileUtils.listFilesFromFolder(folder);           // получаем список нужных нам файлов в виде ключ - значение

        try {
            FileWriter writer = new FileWriter(fileNew);                            // поток на запись в требуемый файл
            for (Map.Entry<String, String> entry : list.entrySet()){
//              System.out.println(entry.getKey() + "  :  " + entry.getValue());
                FileReader reader = new FileReader(entry.getValue());
                Scanner scan = new Scanner(reader);
                while (scan.hasNextLine()){
                    writer.write(scan.nextLine());
                    writer.write("\n");
                }
                reader.close();
            }
     //           writer.write( );
            writer.flush();
            writer.close();
        } catch (IOException e) { e.printStackTrace(); }

    }
}
