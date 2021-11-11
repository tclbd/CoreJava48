package com.jee.d28102021;

public class ExceptionHandlingExample2 {
    //throw, throws
    static void getValue() throws Exception{
        throw new ArithmeticException();
        //System.out.println(1/0);
        //throw new Exception();
 
    } 
    
    public static void main(String[] args) throws Exception {
        getValue();
    }
}
