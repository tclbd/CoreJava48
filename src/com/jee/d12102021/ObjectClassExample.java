package com.jee.d12102021;

import static java.lang.System.gc;

public class ObjectClassExample {

    double d;
    static int a;
    static ObjectClassExample obj;
    final int MY_VAL = 5;
    
    public static void main(String[] args) {
        //reference //class reference //object //object reference //instance
          ObjectClassExample obj1 = new ObjectClassExample();
          obj1.d = 0.0;
          System.out.println(obj1.d);
          obj1.d = 1.2;
          System.out.println(obj1.d);
          ObjectClassExample.a = 1;
          System.out.println(obj1.MY_VAL );
          //gc();

          //super class
          //sub class
          
          String a = "hello";
          a+=1;
          for (int i = 0; i < 10; i++) {
             a += i;
          }
          int i = 10;
          double d = 0.123; //64b
          float f = 0.12354F;
          long l = 0L; //64b
          f=l; //exception
          
          d=l;
          l=(long) d;
          
          d=i;
          
          i=(int) f;
          f=i;
          
          System.out.println(a);
    }
}
