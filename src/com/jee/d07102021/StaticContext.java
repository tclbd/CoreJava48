package com.jee.d07102021;

public class StaticContext {
    static int id;
    int id1;
    static String name;
    static double salary;
    
    static int myAge(){
        return 10;
    }
    
    int myAge1(){
        return 20;
    }
    

    public static void main(String[] args) {
        //class.property
        System.out.println(StaticContext.myAge());
        StaticContext s = new StaticContext();
        System.out.println(s);
        System.out.println(s.myAge1());
    }
    
    static {
        System.out.println("Hello ");
    }
    
}
