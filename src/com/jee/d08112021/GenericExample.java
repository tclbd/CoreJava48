package com.jee.d08112021;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        List<Integer> l= new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        for (int i = 0; i < l.size(); i++) {
            int a = (int) l.get(i);
            System.out.println(a+1);
        }
        
    }
}
