package com.basics.string;

public class StringConstantPool {
    static void main() {
        // They have the same literal value " Java"
        // so they point to the same object in Heap
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2); // compares object
        String s3 = new String("Java");
        System.out.println(s1 == s3); // They are different
        System.out.println(s1.equals(s3));
    }
}
