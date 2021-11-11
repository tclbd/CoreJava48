package com.jee.init;

public class Employee {
    
    //instance || global variable
    public long id;
    public String name;
    public static String lname;
    public int age;
   
    
    private double salary;
    public boolean status;
    
    
    private static int roll; // static variable
//
//    public Employee() {
//    }
//    
    
    
    
    public int olderAge(){
         // all the variables may be static/non static == local/global
        int a = 10; // local variable
        return a;
    }
    
    public static void main(String[] args) {
        // all the variables must be static
        System.out.println("Hello");
    }
    
}
