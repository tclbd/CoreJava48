package com.jee.d10112021;

public class VarLengthArgument {
    
    void abc(int... s){
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]); 
        }
 
    }
    
    public static void main(String[] args) {
           VarLengthArgument vl = new VarLengthArgument();
           vl.abc(1, 2, 3, 4);
    }
}
