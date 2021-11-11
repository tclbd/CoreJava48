package com.jee.d02112021;

public class ShortCircuit {
    
    static void abc(Object obj){
        System.err.println(obj.toString());
        Object[] ob = new Object[10];
        ob[0] = 1;
    }
    
    
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(obj.toString());
        abc(obj);
        boolean b = false;
        int x = 5;
        int y = 6;
        int z = 7;
        if(x>y && (b=true)){
            System.out.println("if "+ b);
        }else{
            System.out.println("else " + b);
        }
        
    }
 
   
}
