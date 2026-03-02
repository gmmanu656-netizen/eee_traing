package com.basics.oppsPillars.single;

public class Person {
    String name;
    Person(String name){ // Constructor
        this.name = name;
    }
}
class Student extends Person{
    int rollN0;
    Student(int rollN0, String name){
        super(name);
        this.rollN0 = rollN0;
    }
    void display(){
        System.out.println(rollN0 + " " + name);
    }

    static void main() {
        Student student = new Student(101, "Manu");
        student.display();
    }
}
