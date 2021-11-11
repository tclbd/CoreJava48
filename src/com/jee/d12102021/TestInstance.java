package com.jee.d12102021;

public class TestInstance {
 int instancecounter;
    static int staticcounter;

    {
        instancecounter += 1;
        System.out.println("instance= " + instancecounter);
        staticcounter += 1;
        System.out.println("static= " + staticcounter);
    }    
    static{
        System.out.println("I am a static block");
    }  

    public static void main(String[] args) {
        new TestInstance();
        new TestInstance();
        new TestInstance();
    }
}
