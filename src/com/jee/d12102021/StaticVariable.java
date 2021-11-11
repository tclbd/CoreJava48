package com.jee.d12102021;

public class StaticVariable {
 // salary  variable is a private static/class variable
    private static double salary;
    int x;//instance/object/non-static variable
    // DEPARTMENT is a constant
    public static final String DEPARTMENT = "Development ";

    void test() {
        //int x=0;//local variable can never be static
        this.x = 0; //non-static member can access non-static member
        salary = 345;//non-static member can access static member        
    }
    static void test2(){
        salary = 34;
    }

    public static void main(String args[]) {
        //x=0; //static member can not access non-static member directly
        StaticVariable sv = new StaticVariable();
        sv.x=100;
        //this.x;// static member dosen't have 'this'
        salary = 1000;
        //int r=0;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
