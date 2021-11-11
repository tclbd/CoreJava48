package com.jee.d10112021;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionPerformance {
        static List<String> list;
    void getItems(){
        list = new ArrayList<String>();
        for (int i = 0; i < 500000; i++) {
            list.add("List " + i);
        }
    }
    
    public static void main(String[] args) {
        CollectionPerformance cp = new CollectionPerformance();
        //while
        long startWhile = new Date().getTime();
        cp.getItems();
        int j = 0;
        while (j < list.size()) {            
            String s = list.get(j);
            j++;
        }
        long endWhile = new Date().getTime();
        System.err.println("While " + (endWhile - startWhile));
        //foreach
        long startForEach = new Date().getTime();
        cp.getItems();
        for (String l : list) { //advanced / enhanced for loop
            String s = l;
        }
        long endForEach = new Date().getTime();
        System.err.println("ForEach " + (endForEach - startForEach));
        //iterator
        long startIterator = new Date().getTime();
        cp.getItems();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String s = iterator.next();
        }
        long endIterator = new Date().getTime();
        System.err.println("Iterator " + (endIterator - startIterator));
        //for
        long startFor = new Date().getTime();
        cp.getItems();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
        }
        long endFor = new Date().getTime();
        System.err.println("For " + (endFor - startFor));
    }
}
