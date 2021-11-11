package com.jee.d06102021;

public class Car {
    int id;
    String name;
    double price;
    double discount;
    boolean status;

    
    //constructor overloading
    public Car() { //non argument
    }

    public Car(double price, double discount) { //argument
        this.price = price;
        this.discount = discount;
    }

    public Car(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Car(String name, int id) {
        this.id = id;
        this.name = name;
    }

    
    double carPrice(){
        return price-discount;
    }
 
}
