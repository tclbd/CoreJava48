package com.jee.d10102021;

public class LoopExample {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                System.out.println(i + " " + j);
//            }
//        }
        int val = 5;
        do{
            System.out.println(val);
            val++;
            if(val==9){
                break;
            }
        }while(true);
        
        int index = 1;
        int end = 5; 
        while(index <= end){
            System.out.println("hello " + index);
            index++;
        }
        
        
        
        
    }
}
