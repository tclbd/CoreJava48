package com.jee.d28102021;

import java.io.IOException;

class A{}

public class ExceptionHandlingExample {
    //try, catch, finally, throw, throws
    //Object --> Throwable --> Exception|Error
    static int getValue(){
        try {
            System.out.println("try");
            return 8;
        } catch (ArithmeticException e) {
             System.out.println("ArithmeticException block " + e);
        } finally{
            System.out.println("hello");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(getValue());               
    }
    
}
