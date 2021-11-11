package com.jee.d07102021;

import java.util.Date;

public class WrapperClass {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer("10");
        System.out.println(a);
        System.out.println(i);
        double d = 20.00;
        Double d1 = new Double("20.011");
        System.out.println(d);
        System.out.println(d1);
    }
}
