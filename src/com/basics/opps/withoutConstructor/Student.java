package com.basics.opps.withoutConstructor;

public class Student {
    // Instance Variables
    int USN;
    String name;
    int marks;
    void evaluteMarks(){
        if (marks < 49) {
            System.out.println(name + " has FAILED");
        }else{
            System.out.println(name + " has PASSED");
        }
    }

    static void main() {
        // Object Creation Syntax: ClassName obj = new ClassName();
        Student s1 = new Student(USN:101, name);
        s1.USN =101;
        s1.name = "Manu";
        s1.marks = 45;
        Student s2 = new Student();
        s2.USN = 102;
        s2.name = "Bharath";
        s2.marks = 60;
        s1.evaluteMarks();
        s2.evaluteMarks();


    }
}
