package com.jee.d21102021;

public class ObjectCasting {
    //upcasting
    //downcasting
    ObjectCasting test(){
        return new SubClass();
    }
}

class SubClass extends ObjectCasting{
    @Override
    SubClass test(){
        return (SubClass) new ObjectCasting();
    }
}
