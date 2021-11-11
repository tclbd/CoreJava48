package com.jee.d17102021;

public class ClassB {

    public int ageA;

    public static int ageB = 20;
    void getAgeB(){
        ClassA a = new ClassA();
        a.getAgeA();
        System.out.println(ageB);
    }
}
