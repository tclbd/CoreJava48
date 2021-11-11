package com.jee.d12102021;

import java.util.Date;

public class FieldInitializeExample {
    //Field variable declaration
    double d;//1. Initialization using default value
    Date date = new Date();//2. Initialization using explicit value
    String s; //3. Initialization using constructor

    public FieldInitializeExample(String s) {
        this.s = s;
    }   
    
    public static void main(String[] args) {
        FieldInitializeExample obj = new FieldInitializeExample("Hello");
        System.out.println(obj.d);
        System.out.println(obj.date);
        System.out.println(obj.s);
    }
}
