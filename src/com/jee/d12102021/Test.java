package com.jee.d12102021;

public class Test {
int x;
    Test(int x){
        this.x = x;
        System.out.println("i am in constrctor "+ x);
    }
    
    void aMethod(int x){
        System.out.println("value is "+x);
    }
    
    public static void main(String[] args) {
        Test test = new Test(55);
        Test test2 = new Test(34);
        test.aMethod(4);
    }
}
