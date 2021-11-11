package com.jee.d12102021;

public class SwitchCaseExample {
    public static void main(String[] args) {
        switch(2){
            case 1 : {System.out.println("1");}
            case 2 : {System.out.println("2");}
            case 3 : {System.out.println("3"); break;}
            case 4 : {System.out.println("4");}
            case 5 : {System.out.println("5");}
            default: {System.out.println("default");}
        }

        if(false) System.out.println(""); else if(true) System.out.println("hi");
    }
}
