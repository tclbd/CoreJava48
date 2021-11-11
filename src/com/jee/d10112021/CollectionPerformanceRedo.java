package com.jee.d10112021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CollectionPerformanceRedo {
   
    static String[] getItems(){
        String[] strArray = new String[9000000];
        for (int i = 0; i < 9000000; i++) {
            strArray[i] = "List " + i;
        }
        return strArray;
    }
    
    public static void main(String[] args) {
        
        String[] arr = getItems();
        List list = Arrays.asList(arr);
        
      
      
        //for
        long startFor = new Date().getTime();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i).toString();
        }
        long endFor = new Date().getTime();
        System.err.println("For " + (endFor - startFor));
        //while
        long startWhile = new Date().getTime();
    
        int j = 0;
        while (j < list.size()) {            
            String s = list.get(j).toString();
            j++;
        }
        long endWhile = new Date().getTime();
        System.err.println("While " + (endWhile - startWhile));
          //iterator
        long startIterator = new Date().getTime();
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
            String s = iterator.next();
        }
        long endIterator = new Date().getTime();
        System.err.println("Iterator " + (endIterator - startIterator));
          //foreach
        long startForEach = new Date().getTime();      
        for (Object list1 : list) {
            String s = list1.toString();
        }
        long endForEach = new Date().getTime();
        System.err.println("ForEach " + (endForEach - startForEach));
    }
}
