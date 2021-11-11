package com.jee.d25102021;

public class ClassA extends ClassB{

    public ClassA() {
        System.out.println("Hello Class A");
    }

    void test() {
        System.out.println("test :: ClassA");
    } 
}


class Test{
    public static void main(String[] args) {
        new ClassA().test();
    }
}