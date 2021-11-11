package com.jee.d21102021;

public abstract class AbstractExample {
     
    String test(){
        return null;
    }
    
    abstract int testABC();
  
}

class A extends AbstractExample{

    @Override
    int testABC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
