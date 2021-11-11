package com.jee.d08112021;

import java.util.List;

public class EmployeeSystem implements ISystem<Employee>{

    @Override
    public Employee insert(Employee i) {
        System.out.println(i.getId() + " " + i.getName() + " " + i.getSalary());
        System.out.println(i.getAddress().getRoad()+ " " + i.getAddress().getArea() + " " + i.getAddress().getDivision());
        return i;
    }

    @Override
    public Employee update(Employee i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
