package com.jee.d10102021;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int val = s.nextInt();
        if(val == 5){
            System.out.println("5");
        }else if(val == 6){
            System.out.println("6");
        }else if(val == 7){
            System.out.println("7");
        }else{
            System.out.println("else");
        }
    }
}
