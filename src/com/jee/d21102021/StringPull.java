package com.jee.d21102021;

public class StringPull {
    String s = "hello";
    String s1 = "h" + "ello";
    String s2 = new String("hello");
    
    // String pool
    void example(){
         if(s == s2){ //checks the reference also
            System.out.println("s == s1");
         }else{
             System.err.println("s NOT s1");
         }
         if(s.equals(s2)){ //checks the value only
             System.out.println("s.equals(s1)");
         }else{
             System.err.println("s NOT (s1)");
         }
    }
    public static void main(String[] args) {
       new StringPull().example();
    }
}
