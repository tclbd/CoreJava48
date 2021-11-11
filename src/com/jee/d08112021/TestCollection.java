package com.jee.d08112021;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

public class TestCollection {
    public static void main(String[] args) {
        ISystem personSystem = new PersonSystem();
        //List<Person> personList = personSystem.getAll();
        Set<Person> personList = new PersonSystem().getAllSet();
        
        System.err.println(personList.size());
        for (Person person : personList) {
            System.out.println(
                                person.getId() + " " + 
                                person.getName() + " " + 
                                person.getSalary()
                              );
            System.out.println(person.getAddress().getRoad() + " " + 
                               person.getAddress().getArea() + " " + 
                               person.getAddress().getDivision() );
        }
    }
}
