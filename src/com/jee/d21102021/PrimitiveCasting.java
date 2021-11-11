package com.jee.d21102021;

public class PrimitiveCasting {
    public static void main(String[] args) {
        //implicit casting
        //explicit casting
        char c = 'c'; //16bit
        int i = c; //32bit implicit casting //type safe
        int ii = Integer.valueOf(c);
        int iii = Integer.valueOf(c).intValue();
        c = (char) i; 
    }
}
