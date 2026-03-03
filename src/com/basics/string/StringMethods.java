package com.basics.string;

import java.util.SplittableRandom;

public class StringMethods {
    static void main() {
        String str = "Tripillar Solutions";
        System.out.println("Length:" + str.length());
        System.out.println("Char at index 2:" + str.charAt(2));
        System.out.println("Char at last index:" + str.charAt(str.length() -1 ));
        System.out.println("Uppercase:" + str.toUpperCase());
        System.out.println("Lowercase:" + str.toLowerCase());
        System.out.println("Substring(0:9):" + str.substring(0,9));
        System.out.println("Equals (Tripillar Solutions):" + str.equals("Tripillar Solutions"));
        System.out.println("Equals (case Doesn't Matter): " + str.equalsIgnoreCase("tripillar Solutions"));
        String jumbled = "ManuIs1FromECE1Sec1A";
        // "Manu, Is, From, ECE, Sec, B";
        String[] words = jumbled.split("1");
        System.out.println(words[3]);
        String name = "    Abhi  ";
    }
}
