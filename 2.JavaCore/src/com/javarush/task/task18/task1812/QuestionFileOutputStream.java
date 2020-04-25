package com.javarush.task.task18.task1812;

import java.io.*;

import static java.lang.System.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {


    private AmigoOutputStream temp;

    public QuestionFileOutputStream(AmigoOutputStream amigoOutputStream) {
        this.temp = amigoOutputStream;
    }

    @Override
    public void flush() throws IOException {
        temp.flush();
    }

    @Override
    public void write(int b) throws IOException {
        temp.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        temp.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        temp.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String lit = rd.readLine();
        if (lit.contains("Д")){
            temp.close();
        }
  //      if (lit.contains("Н")) null;
    }
}

