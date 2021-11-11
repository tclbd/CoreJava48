package com.jee.d31102021;

import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {
        try {

            File file = new File("e:\\ab.txt");
//            File file2 = new File("d://filename.txt");
//            System.out.println(file2.getAbsolutePath());
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
