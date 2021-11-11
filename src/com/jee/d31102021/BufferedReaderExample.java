
package com.jee.d31102021;

import java.io.*;

public class BufferedReaderExample {

    public static void main(String[] args) {

        try {
            
            FileReader fr = new FileReader("e:\\newfilename.txt");
            BufferedReader br = new BufferedReader(fr);

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
            //System.out.println(e);
            //System.err.println(e);
        }
    }
}
