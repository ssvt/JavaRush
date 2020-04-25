package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;
    public static void main(String[] args) {

    }

    public FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fileDescriptor) {
        fileWriter = new FileWriter(fileDescriptor);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf,off, len);
        System.out.print(new String(cbuf, off, len));
    }
    public void write(int c) throws IOException {
        fileWriter.write(c);
        System.out.print(c);
    }
    public void write(String str) throws IOException {
        fileWriter.write(str);
        System.out.print(str);
    }

    public void write(String str, int off, int len) throws IOException {
        fileWriter.write(str, off, len);
        System.out.print(str.substring(off, off + len));
    }

    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
        System.out.print(cbuf);
    }

    public void close() throws IOException {
        fileWriter.close();
    }

}
