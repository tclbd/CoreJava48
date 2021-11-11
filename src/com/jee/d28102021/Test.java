package com.jee.d28102021;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setId(100);
        s.setName("Mr. A");
        Address a = new Address();
        a.setRoad(10);
        a.setArea("Kakrail");
        a.setDivision("Dhaka");
        s.setAddress(a);
        System.out.println(s.getAddress().getArea());
    }
}
