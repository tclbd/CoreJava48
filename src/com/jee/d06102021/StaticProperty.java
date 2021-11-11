package com.jee.d06102021;

public class StaticProperty {
    static int id;
    int id1;
    String name;
    double salary;

    void nonStaticMethod(){}
    //non-static properties/methods can NOT be used inside a static block/context
    //static properties/methods can be used inside a static/non-static block/context
    public static void main(String[] args) {
        System.out.println(id);

    }

}
