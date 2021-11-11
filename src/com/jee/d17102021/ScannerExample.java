package com.jee.d17102021;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value ");
        int txt = Integer.valueOf(s.nextLine());
        System.out.println(txt+1);
    }
}


