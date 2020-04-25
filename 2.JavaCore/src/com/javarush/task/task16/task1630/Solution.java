package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    static
    {
        try
        {
            BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
            reader.close();
        } catch (IOException e) {}
    }
    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }
    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public static interface ReadFileInterface {
        void setFileName(String fullFileName);
        String getFileContent();
        void join() throws InterruptedException;
        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private String fullFileName="";
        private String fileContent="";

        public void setFileName(String fullFileName)
        {
            this.fullFileName = fullFileName;
        }

        public String getFileContent()
        {
            return fileContent;
        }
        public void run()
        {
            try
            {
                BufferedReader reader = new BufferedReader(new FileReader(fullFileName));
                String str;
                while ((str = reader.readLine()) != null){
                    fileContent+=str+" ";
                }
                reader.close();
            } catch (Exception e) {}
        }
    }
}

