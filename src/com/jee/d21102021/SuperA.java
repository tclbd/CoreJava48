package com.jee.d21102021;

public class SuperA {

    public SuperA() {
        System.out.println("Super Constructor");
    }
    SuperA test(){
        return new SubB();
    }
}
//covariant return
// for class type (there must be a relationship) 
class SubB extends SuperA{

    public SubB() {
        super();
        System.out.println("Sub Constructor");
    }
    SubB sum(){
        return null;
    }
}

class Test{
    public static void main(String[] args) {
        new SubB();
    }
}
