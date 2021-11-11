package com.jee.d19102021;

public class PassByValue {
    
    int value = 10;
    
    void getValue(int value){ //pass by value
        value = 500;
    }
    
    void changeValue(PassByValue t){ // pass by reference
        t.value = 400;
    }
    
    public static void main(String[] args) {
        PassByValue t = new PassByValue();
        t.getValue(50);
        System.out.println("The value is (pass by value) " + t.value);
        t.changeValue(t);
        System.out.println("The value is (pass by reference) " + t.value);
    }
}
