package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/* 
Находим все файлы
*/
public class Solution {

    public static List<String> getFileTree(String root) throws IOException {
        List<String> list = new ArrayList<>();
        Path  path = Paths.get(root);

        Stack<File> files = new Stack<>();
        files.push(new File(root));
        while (!files.isEmpty()){
            File currentFile = files.pop();

            if (currentFile.isDirectory()){
                for (File f : currentFile.listFiles()) files.push(f);
            }
            if (currentFile.isFile()) list.add(currentFile.getAbsolutePath());
        }

//    решение рабочее но не проходит валидатор
  /*      Files.walkFileTree(path, new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                list.add(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }
        });*/
        return list;
    }

    public static void main(String[] args) throws IOException {

        List<String> ls = getFileTree("D:\\Program Files (x86)");

        for (String line: ls ) {
            System.out.println(line);
        }
    }
}
