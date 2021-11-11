
package com.jee.d11112021.comparablex;

public class Student implements Comparable {

    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Object obj) {
        Student st = (Student) obj;
//        if (age == st.age) {
//            return 0;
//        } else if (age > st.age) {
//            return 1;
//        } else {
//            return -1;
//        }
        System.out.println("==========="+st.age +" compare with "+this.age);
        return st.age-this.age;
        //desthis.a
        //return this.name.compareTo(st.name);
    
    }
}
