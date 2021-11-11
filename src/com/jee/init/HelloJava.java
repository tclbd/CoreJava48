package com.jee.init; //package declaration

// How to comment in JAVA - Single Line Comment
import com.jee.core.CoreClass;


/*
    How to comment in JAVA 
    Multi Line Comment
*/

 public class HelloJava {
     
     
    // A class holds 
    // properties ==> variables / Data Types
    // methods ==> such as JS functions
    
    /* Two types of Data Type
        - Primitive Type
        - Class Type
    */
    

    // main method is the starting point of a JAVA class
    /* Access Modifier
        public, private, protected, default
    */
     
    public static void main(String[] args) {
        System.out.println("");
        
        //class object = reference of that class/instance of that class
        Employee emp = new Employee(); //Syntax of creating an OPbject
        emp.name = "Mr. A";
        emp.status = false;
        
        
        
        System.out.println(emp.name);
        Employee.lname = "some value";
        
    
        CoreClass cc = new CoreClass();
        cc.address = "Dhaka";
        
    }
    

}