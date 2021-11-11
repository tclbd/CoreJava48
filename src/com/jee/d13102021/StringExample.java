package com.jee.d13102021;

public class StringExample {
    //String is immutable
    
    
    public static String name;
    public static String stringConcat(){
        String s = new String("Hello"); //immutable
        String ss = "Hello";
        for (int i = 0; i < 100000; i++) {
            s.concat("world");
        }
        return s;
    }
    
    
    public static StringBuffer stringBufferConcat(){
        StringBuffer s = new StringBuffer("Hello"); //mutable
        for (int i = 0; i < 100000; i++) {
            s.append("world");
        }
        return s;
    }
    
    public static StringBuilder stringBuilderConcat(){
        StringBuilder s = new StringBuilder("Hello"); //mutable
        for (int i = 0; i < 100000; i++) {
            s.append("world");
        }
        return s;
    }
    
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        stringConcat();
        System.out.println("String Time taken : " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        stringBufferConcat();
        System.out.println("StringBuffer Time taken : " + (System.currentTimeMillis() - start));
        start = System.currentTimeMillis();
        stringBuilderConcat();
        System.out.println("StringBuilder Time taken : " + (System.currentTimeMillis() - start));
        
    }
}
