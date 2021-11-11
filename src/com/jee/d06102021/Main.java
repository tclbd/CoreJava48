package com.jee.d06102021;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(); // car is the object reference & class type
        System.err.println(car.name);
        car.name = "Tesla";  //Object.property
        car.price = 1500;
        car.discount = 200;
        System.out.println("car obj" + car);
        System.out.println(car.name + " " + car.carPrice());

        Car car1 = new Car();
        car1.name = "Toyota";
        car1.price = 1200;
        car1.discount = 100;
        System.out.println("car1 obj" + car1);
        System.out.println(car1.name + " " + car1.carPrice());

        new Car().name = "new name";

        System.out.println("annonymous object " + new Car());

        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");
        System.out.println("........");

        System.out.println(new Car(1500, 200).carPrice());
        Car c = new Car(1500, 100);
        System.out.println(c.carPrice());
    }
}
