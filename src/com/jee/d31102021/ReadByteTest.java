package com.jee.d31102021;

import java.io.*;

//Simple program of reading data from the file
public class ReadByteTest {

    public static void main(String args[]) {
        try {
            FileInputStream fin = new FileInputStream("e:/abc.txt");
            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
