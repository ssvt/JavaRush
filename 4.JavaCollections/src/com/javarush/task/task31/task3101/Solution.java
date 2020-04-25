package com.javarush.task.task31.task3101;

import java.io.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;


/*
Проход по дереву файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        File dir = new File(args[0]);
        File file = new File(args[1]);
        File newFile = new File(file.getParent() + File.separator + "allFilesContent.txt");
        FileUtils.renameFile(file, newFile);

        FileOutputStream fileOutputStream = new FileOutputStream(newFile);
        fileOutputStream.close();

        //сбор файлов в заданом каталоге <50 байт, сортировка
        ArrayList<File> files = new ArrayList<>();
        files = folderOpener(dir);
        sortFilesByName(files);

        fileOutputStream = new FileOutputStream(newFile);
        for(File fl: files){
            FileInputStream fileInputStream = new FileInputStream(fl);

            byte buff[] = new byte[fileInputStream.available()];
            fileInputStream.read(buff);
            fileOutputStream.write(buff);

            fileOutputStream.flush();
            fileOutputStream.write("\n".getBytes()); //можно использовать System.lineSeparator(), но на всякий случай так, а вдруг ВАЛИДАТОР

            fileInputStream.close();
        }
        fileOutputStream.close();

    }

    //сортировка
    public static void sortFilesByName(ArrayList<File> list){
        list.sort(new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (o1.getName()).compareTo(o2.getName());
            }
        });
    }

    public static ArrayList<File> folderOpener(File directory){
        ArrayList<File> fileList = new ArrayList<>();
        File file = new File(directory.getAbsolutePath());

        for(File entry: file.listFiles()){
            if(entry.isDirectory()) {
                ArrayList<File> innerFiles = folderOpener(entry);
                for(File inner: innerFiles){
                    fileList.add(inner);
                }
            }else{
                if (entry.length() > 50) {
                    FileUtils.deleteFile(entry);
                } else {
                    fileList.add(entry);
                }
            }
        }
        return fileList;
    }
}
