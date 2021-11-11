package com.jee.d28102021;

public class Car {
    int a;
    Tesla t;
    
    public Car() {
        t = new Tesla();
        t.model = 122;
        System.out.println(t.model);
    }

    void getValue(Tesla t){
       t.model = 123;
       t.price = 100.00;
        System.out.println(t.model);
    }
    
    public static void main(String[] args) {
        new Car().getValue(new Tesla());
    }
    
}

class Tesla{
    int model;
    double price;
    
//    public static void main(String[] args) {
//        Tesla t = new Tesla();
//        t.model = 5888;
//        t.price = 100.255;
//        System.out.println(t.price);
//    }
}
