package com.jee.d12102021;

public class LocalTest {
    public int y;
    static int z;
    final static int GO=0;
    String s;

    public void calAge() {
        int age=0;//cause compilation error if not initialized
        age = age + 7;
        y = y + 3;
        System.out.println("Age is : " + y);
    }

    public static void main(String args[]) {
        LocalTest test = new LocalTest();
        System.out.println(LocalTest.z);
        test.calAge();
    }
}
