package com.jee.d11102021;

public class SDArray {
    
   
    static int a;
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10}; // Method 1
        
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
        }
        int arr2[] = new int[5]; // Method 2
        arr2[4] = 10;
        //System.out.println(arr2[2]);
        
        
        Laptop lapArray[] = new Laptop[4];
        Laptop l1 = new Laptop();
        l1.setId(1);
        l1.setName("Dell");
        l1.setPrice(20000.00);
        lapArray[0] = l1;
        lapArray[1] = new Laptop(2, "Acer", 21000.00);
        lapArray[2] = new Laptop();
        lapArray[3] = new Laptop();

        
        for (int i = 0; i < lapArray.length; i++) {
            //System.out.println(lapArray[i].getId() + " " + lapArray[i].getName() + " " + lapArray[i].getPrice());
        }
        
        for (Laptop lap : lapArray) {
          //System.out.println(lap.getId() + " " + lap.getName() + " " + lap.getPrice());   
        }
        
        String strArray[] = new String[]{"A", "B", "C"}; // Method 3
        
        for (String strArray1 : strArray) {
            System.out.println(strArray1);
        }

        
    }
}
