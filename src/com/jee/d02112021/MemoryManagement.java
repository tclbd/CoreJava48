package com.jee.d02112021;
//Stack => StackOverFlowError
//Heap => OutOfMemoryError
public class MemoryManagement { //Line 1
    public static void main(String[] args) { //Line 2
        int i = 1; //Line 3
        Object obj = new Object(); //Line 4
        MemoryManagement mmgt = new MemoryManagement(); //Line 5
        mmgt.print(obj); //Line 6
    } //Line 11
    private void print(Object param){ //Line 7
        String str = param.toString(); //Line 8
        System.out.println(str); //Line 9
    } //Line 10
} //Line 12
