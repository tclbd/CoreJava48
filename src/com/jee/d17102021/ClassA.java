package com.jee.d17102021;

//extends
//JAVA doesn't support multiple inheritance
public class ClassA extends ClassB{
    public static int ageA = 10;
    
    static void getAgeA(){
        System.out.println(ageA);
    }
    
    public static void main(String[] args) {
        getAgeA();
        System.out.println(ageB);
    }
}
