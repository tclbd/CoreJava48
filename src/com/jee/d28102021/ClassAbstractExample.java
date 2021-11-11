package com.jee.d28102021;

public abstract class ClassAbstractExample{
     int a;
     abstract void abc();
     void abcd(){
         System.out.println("void method abcd");
     }
}

class Testing{
    public static void main(String[] args) {
        ClassAbstractExample a = new ClassAbstractExample() { //inner class implementation
            @Override
            void abc() {
                System.out.println("void abc");
            }
        };
        a.abc();
        a.abcd();
        a.a = 10;
        System.out.println(a);
    }

}
