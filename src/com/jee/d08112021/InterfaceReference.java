package com.jee.d08112021;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;

interface InterfaceA{} //full abstraction 1
abstract class ABSClass implements InterfaceA{} //partial abstraction 2
class CClass extends ABSClass implements InterfaceA{} //implementation 3

public class InterfaceReference {

    
    public static void main(String[] args) {
        List list;
        //list = new ArrayList();
       // list = new LinkedList();
        //list = new Vector();
        
        InterfaceA ia = new CClass();//loose Coupling
        ABSClass abscls = new CClass();
        CClass cls = new CClass(); //Tight Coupling

        ArrayList ar = new ArrayList();
        ar.add("str1");
        ar.add("str2");
        ar.add("str3");

        for (int i = 0; i < ar.size(); i++) {
           // System.out.println(ar.get(i));
        }
        for (Object ar1 : ar) {
           // System.out.println(ar1);
        }
        
        for (Iterator iterator = ar.iterator(); iterator.hasNext();) {
            Object next = iterator.next();
            
        }
        
        List arl = new ArrayList();
        arl.add("itr1");
        arl.add("itr2");
        arl.add("itr3");
        
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }
        AbstractList aslist = new ArrayList();
        
    }
}
