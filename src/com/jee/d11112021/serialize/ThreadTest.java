package com.jee.d11112021.serialize;

public class ThreadTest extends Thread {

    @Override
    public void run() {
        print();
    }

    void print() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Child Thread: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest tt = new ThreadTest();
        tt.start();

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Main Thread: " + i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
