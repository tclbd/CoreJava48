package com.jee.d17112021;


public class TestClock extends Thread{
    static final TestClock LOCK = new TestClock();
    public static void main(String[] args) throws InterruptedException {
        Thread tick = new Thread(new Tick());
        Thread tock = new Thread(new Tock());
        tick.start();
        tock.start();
        tick.join(); 
        tock.join();
    }
}
