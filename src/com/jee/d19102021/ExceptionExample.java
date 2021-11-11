package com.jee.d19102021;

public class ExceptionExample {
 
    public static void main(String[] args) {
         System.exit(0);
        System.out.println(0/1);
        try {
           //System.out.println(1/0); //problem
           
        } catch (ArithmeticException e) {
            //System.out.println("hello exception");
            //System.out.println(e.toString());
        }finally{
            System.out.println("finally");
        }
        System.out.println("hello");
    }
}
