package com.jee.d07102021;

public class ClassA {
    public static void main(String[] args) {
        ProperetyHiding ph = new ProperetyHiding();
        ph.setName("Jack");
        System.out.println(ph.getName());
        
        ph.setName("Jimmy");
        System.out.println(ph.getName());
        
        //ph.name = "Jack";
        //System.out.println(ph.name);
        //ph.name = "Jimmy";
        //System.out.println(ph.name);

    }
}
