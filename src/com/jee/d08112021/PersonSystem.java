package com.jee.d08112021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class PersonSystem implements ISystem<Person>{

    @Override
    public Person insert(Person i) {
        System.out.println(i.getId() + " " + i.getName() + " " + i.getSalary());
        System.out.println(i.getAddress().getRoad()+ " " + i.getAddress().getArea() + " " + i.getAddress().getDivision());
        return i;
    }

    @Override
    public Person update(Person i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getAll() {
        Person p = new Person();
        Address a = new Address();
        List<Person> personList = new ArrayList<Person>();

        a.setRoad(12);
        a.setArea("Mirpur");
        a.setDivision("Dhaka");
        p.setId(101);
        p.setName("Mr. A");
        p.setSalary(19222.21);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 
        
        //a = new Address();
        a.setRoad(13);
        a.setArea("Motijheel");
        a.setDivision("Dhaka");
        p.setId(102);
        p.setName("Mr. B");
        p.setSalary(22000.23);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 
        
        
        a.setRoad(14);
        a.setArea("Dhanmondi");
        a.setDivision("Dhaka");
        p.setId(103);
        p.setName("Mr. C");
        p.setSalary(18000.523);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 

        return personList;
    }
    

    public Set<Person> getAllSet() {
        Person p = new Person();
        Address a = new Address();
        Set<Person> personList = new LinkedHashSet<Person>();

        a.setRoad(12);
        a.setArea("Mirpur");
        a.setDivision("Dhaka");
        p.setId(101);
        p.setName("Mr. A");
        p.setSalary(19222.21);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 
        
        p = new Person();
        a.setRoad(13);
        a.setArea("Motijheel");
        a.setDivision("Dhaka");
        p.setId(102);
        p.setName("Mr. B");
        p.setSalary(22000.23);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 
        
        p = new Person();
        a.setRoad(14);
        a.setArea("Dhanmondi");
        a.setDivision("Dhaka");
        p.setId(103);
        p.setName("Mr. C");
        p.setSalary(18000.523);
        p.setAddress(a);
        System.err.println(p);
        personList.add(p); 

        return personList;
    }


}
