package com.basics.string;

public class DifferenceDemo {
    static void main() {
        String s = "Java";
        // hashcode -> unique id or no given by JVM
        System.out.println("String before:" + s.hashCode());
        s = s + "DSA";
        System.out.println("String after:" + s.hashCode());
        // This proves that String are IMMUTABLE
        for (int i=0; i<1000; i++) {
            s = s + "DSA";
        }// This is bad because it will create 1000 new objects
        // To do this we have two special Mutable Strings
        // StringBuffer & StringBuilder -> java.lang
        StringBuilder builder = new StringBuilder("Java");
        System.out.println(" builder before" + builder.hashCode());
        builder.append("DSA");
        System.out.println("builder after " + builder.hashCode());

    }
}
