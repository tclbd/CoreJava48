package com.jee.d17112021;

import static java.lang.Thread.sleep;

//Multitasking - more than one task at a time
//Multithreading - more than one thread simultaneously / at a time
//Multiprocessing - more than one task at a time (related/based on CPU)
//Parallelprocessing - more than one CPU in a single PC

public class ThreadTest implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("test1 " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
    public static void main(String[] args) {
        Thread t = new Thread(new ThreadTest());//
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("test2 " + i);
            try {
                System.out.println("test2 before sleep");
                Thread.sleep(1000);
                System.out.println("test2 after sleep");
            } catch (Exception e) {
            }
        }
    }
}

class TestThread{
    
}


class ThreadTest2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("threadtest2 " + i);
            try {
                sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}