package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            FileInputStream inputStream = new FileInputStream(new File(rd.readLine()));
            if (inputStream.available() < 1000) {
                inputStream.close();
                rd.close();
                throw new DownloadException();
            }

            inputStream.close();

        }

    }

    public static class DownloadException extends Exception{

    }
}
