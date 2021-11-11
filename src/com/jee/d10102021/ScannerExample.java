package com.jee.d10102021;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter first value...");
        int val = s.nextInt();
        System.out.println("Please enter second value...");
        int val2 = s.nextInt();
        System.out.println("The sum is " + (val+val2));
 
    }
}
