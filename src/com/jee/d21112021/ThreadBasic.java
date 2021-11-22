package com.jee.d21112021;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadBasic extends Thread{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("hello");
        try {
            sleep(1000);
            wait(1220);
        } catch (InterruptedException ex) {
        }
    }
    
    public static void main(String[] args) {
        ThreadBasic t1 = new ThreadBasic();
        t1.start();
        try {
            Thread.sleep(1000);
            new Object().wait(12000);
        } catch (Exception e) {
        }
    }
}
