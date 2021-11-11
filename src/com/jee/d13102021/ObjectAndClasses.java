package com.jee.d13102021;

import com.jee.d12102021.ImportExample;
import static com.jee.d12102021.ImportExample.y; //static import

public class ObjectAndClasses { 

    //user defined data type
    
    String s = new String("value");
    String ss = "value";
    static ObjectAndClasses oc;
    int a = 10;//predefined data type
    int p; // object variable
    
    void test(){
        ImportExample.y = 10;
        y = 10;
        int p;
        this.p = 10;
        System.out.println(this);
    }
    
    
    public static void main(String[] args) {
        ObjectAndClasses oc = new ObjectAndClasses();
        //System.err.println(oc);
        ObjectAndClasses oc1 = new ObjectAndClasses();
        //oc1.test();
//        oc.a = 11;
//        System.out.println(oc.a);
//        System.out.println(oc);
//        oc = new ObjectAndClasses();
//        System.err.println(oc.a);//
//        oc.a = 12;
//        System.err.println(oc.a);
//        System.err.println(oc);
        main(args);
        System.out.println(args);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args);
//        }
    }
}

//class SecondClass {
//    int a = 11;
//    public static void main(String[] args) {
//        
//    }
//}
