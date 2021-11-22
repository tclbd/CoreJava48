package com.jee.d21112021;

import java.util.HashMap;
import java.util.Hashtable;

public class HashingExample {
    public static void main(String[] args) {
        Hashtable<Integer, Object> hm = new Hashtable<Integer, Object>();
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < 3; i++) {
            //hm.put(i, arr[i]);
            hm.put(i, new Person("A", 20));
            Person p = (Person) hm.get(i);
            System.out.println(p.getName() + " " + p.getAge());
        }
        //System.out.println(hm);
    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
