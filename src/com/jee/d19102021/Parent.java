package com.jee.d19102021;

public class Parent {
    int pa, pb;
    void showValue(){
        System.out.println("Parent " + (pa));
    }
}
class Child extends Parent {
    int ca, cb;
    void showChildValue(){
        System.out.println("Child " + (ca));
    }
    void sum(){
        System.out.println("Sum of " + (pa+ca));
    }
}

class InheritExample{
    
    void checkReference(Parent p){
        System.out.println(this);
    }
    
    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        
        InheritExample i = new InheritExample();
        i.checkReference(c);
        p.pa = 11;
        p.showValue();
        c.pa = 10; //
        c.ca = 20;
        c.showChildValue();
        c.sum();
        System.out.println(c.pa);
        System.out.println(p.pa);
    }
}

