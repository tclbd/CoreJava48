package com.jee.d12102021;

//Multi-Dimensional Array

import com.jee.d11102021.Laptop;

public class MDArray {
    public static void main(String[] args) {
        int sdArray[] = {};
        int mdArray[][] = {{1,2,3}, {2,2}, {3,2}, {4,2}, {88}}; // Method 1
        System.out.println(mdArray.length);
        for (int i = 0; i < mdArray.length; i++) {
            String s = "";
            for (int j = 0; j < mdArray[i].length; j++) {
                s += mdArray[i][j] + ",";
            }
            System.out.println(s);
        }
        
//        int mdArray[][] = new int[5][4]; // Method 2
//        mdArray[0][0] = 1;
//        mdArray[0][1] = 2;
//        mdArray[0][2] = 3;
        //int mdArray[][] = new int[][]{{1,2,3}, {2,2}, {3,2}, {4,2}, {}}; // Method 3
        

        //System.out.println(mdArray[0].length);
        
        Laptop lapArray[][] =  {
                {new Laptop(1,"DELL", 100.00), new Laptop(2, "ACER", 300.00)}, 
                {new Laptop(3, "HP", 500.00)}, 
                {new Laptop(4, "LG", 800.00), new Laptop(5, "LENOVO", 700.036)}
            };
        for (Laptop[] lapArray1 : lapArray) {
            for (Laptop lap : lapArray1) {
                System.out.println(lap.getId() + " " + lap.getName() + " " + lap.getPrice());
            }
        }
        
    }
}
