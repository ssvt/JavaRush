package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FileUtils {
    public static Map<String, String> mapList  = new TreeMap<>();


    public static void deleteFile(File file) {
        if (!file.delete()) System.out.println("Can not delete file with name " + file.getName());

    }

    public static void renameFile(File source, File destination) {
        if (!source.renameTo(destination)) System.out.println("Can not rename file with name " + source.getName());
    }

    public static boolean isExist(File file) {
        return file.exists();
    }

    public static Map<String, String> listFilesFromFolder(final File folder){
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesFromFolder(fileEntry);
            } else {
                if(fileEntry.length() <= 50){
                    String fileName = fileEntry.getName();
                    fileName = fileName.toLowerCase();
                    mapList.put(fileName, fileEntry.getAbsolutePath());
               }
            }
    //        Collections.sort(list);
    //        list.sort(String::compareToIgnoreCase);
        }
        return mapList;
    }
}
