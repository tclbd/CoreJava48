
package com.jee.d11112021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        HashSet list = new HashSet();
        System.out.println(list.size());
        list.add("C");
        list.add("A");
        list.add("B");
        list.add("C");
        
        System.out.println(list.size());
        Iterator iterate = list.iterator();
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));            
//        }
    }
}
