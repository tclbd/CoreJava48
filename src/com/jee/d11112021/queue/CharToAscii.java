package com.jee.d11112021.queue;

public class CharToAscii {
    public static void main(String[] args) {
        char[] alphabets = {'b', 'e', 'd', 'h', 'j', 'a', 'c', 'f', 'g','p',
            'i', 'B', 'E', 'D', 'H', 'J', 'A', 'C', 'F', 'G', 'I'};
        
        for (int i = 0; i < 20; i++) {
            char c = alphabets[i];
            System.out.println(c+"= "+(int)c);
        }
    }
}
