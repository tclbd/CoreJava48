package com.jee.d02112021;

public class SingleTonPattern {

    static final double PI = 3.1416;
    
    private SingleTonPattern() {
    }
    
    static SingleTonPattern stp = null;
    
    static SingleTonPattern getInstance(){
        //this will ensure single object
        if(stp == null){
            stp = new SingleTonPattern();
        }
        return stp;
    }
    
    void print(){
        System.out.println("Yahoo!");
    }
    
    public static void main(String[] args) {
        SingleTonPattern st = new SingleTonPattern();
        st.print();
    }
}

class ClassA{
    public static void main(String[] args) {
        System.out.println(SingleTonPattern.PI);;
        SingleTonPattern st = SingleTonPattern.getInstance();
        System.out.println(st);
        st.print();
    }
}
