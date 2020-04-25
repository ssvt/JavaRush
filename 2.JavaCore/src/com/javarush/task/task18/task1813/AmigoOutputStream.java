package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";

    public AmigoOutputStream(String name) throws FileNotFoundException {
        super(name);
    }
    public AmigoOutputStream(FileOutputStream filename) throws FileNotFoundException {
        super(String.valueOf(filename));
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b);
    }

    @Override
    public void flush() throws IOException {
        super.flush();
    }

    @Override
    public void close() throws IOException {
        this.flush();
        System.out.println("JavaRush © All rights reserved.");
        super.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
