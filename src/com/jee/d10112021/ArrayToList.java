package com.jee.d10112021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] strArray = {"A", "B", "C", "D", "E"};
        List<String> strList = Arrays.asList(strArray);
        //strList.add("F");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
