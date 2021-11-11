package com.jee.d19102021;

public class StaticClass {
    static class A{
        public static String name = "Dhaka";
        public int age = 10;
    }
    public static void main(String[] args) {
        A a = new A();
        System.out.println(A.name);
        System.out.println(a.age);
    }  
}

