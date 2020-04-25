package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String file1pos = br.readLine();
        String file2pos = br.readLine();
        String file3pos = br.readLine();
        FileInputStream file1 = new FileInputStream(file1pos);
        FileOutputStream file2out = new FileOutputStream(file2pos);
        FileOutputStream file3out = new FileOutputStream(file3pos);
        int bytesize = file1.available();
        int chetnoe = file1.available()%2;
        int count = 0;
 //       System.out.println(chetnoe);
        if (chetnoe==1) {
            while(file1.available()>0) {
                int read = file1.read();
                if (count>bytesize/2) {
                    file3out.write(read);
                    count++;
                }
                else
                {
                    file2out.write(read);
                    count++;
                }
            }
        }
        else if (chetnoe == 0) {
            while (file1.available()>0) {
                int read = file1.read();
                if (count>=bytesize/2) {
                    file3out.write(read);
                    count++;
                }
                else {
                    file2out.write(read);
                    count++;
                }
            }
        }
        file1.close();
        file2out.close();
        file3out.close();

    }
}