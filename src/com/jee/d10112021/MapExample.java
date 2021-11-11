package com.jee.d10112021;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("name", "Mr. A");
        map.put("age", 22);
        map.put("age", 23);
        
        Set s = map.keySet();
        Collection c = map.values();
        for (Object c1 : c) {
            
            System.out.println(c1);
        }
        for (Object s1 : s) {
            System.out.println(s1);
            System.out.println(map.get(s1));
        }
        List<String> list = new ArrayList<String>();
        Map<Integer, List<String>> map1 = new HashMap();
        map1.put(3, list);
        System.out.println(map1.get(3));
            

    }
}
