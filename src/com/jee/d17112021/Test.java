
package com.jee.d17112021;


public class Test implements Runnable{

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
            System.out.println(i+ " in doSomething");
            Thread.sleep(1000);
        }
        System.out.println("Exiting doSomething...");
        } catch (InterruptedException ex) {
            ex.printStackTrace();                    
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t  =new Thread(new Test());
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ " in main");
            Thread.sleep(500);
        }
        System.out.println("Exiting main...");
        
    }
}
