package com.jee.d10112021;

public class ExceptionPropagation {
    void a(){
        int i = 1/0;
    }
    void b(){
        a();
    }
    void c(){
        try {
             b();
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Exception handled");
        }
    }
    
    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.c();
    }
}
