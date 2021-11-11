package com.jee.d08112021;

class ClassA {}
class ClassB {}
class ClassC {}
class ClassD extends ClassC{}
interface I2 {}
interface I1 extends I2{}
interface IA extends I1{}
interface IB extends IA{}
interface IC extends IB{}
class Test implements IC{}
public class CollectionOfObjects {
    IA ia;
    ClassA a;
    ClassB b;
    ClassC c;
    ClassD d;
    public static void main(String[] args) {
       IA i1 = new Test();
       IC i2 = new Test();
       IB i3 = new Test();
       I1 i4 = new Test();
       I2 i5 = new Test();
              
      ClassC cc = new ClassC();
      ClassC dd = new ClassD();
       
       CollectionOfObjects cob = new CollectionOfObjects();
       cob.a = new ClassA();
       cob.b = new ClassB();
       cob.c = new ClassC();
       cob.d = new ClassD();
       
    }
}


