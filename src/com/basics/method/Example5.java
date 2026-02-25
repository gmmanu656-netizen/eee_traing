package com.basics.method;

public class Example5 {
    static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    static void main() {
        System.out.println(" HW-11: " + hammingWeight(11));
        System.out.println(" HW-5: " + hammingWeight(5));
        System.out.println(" HW-0: " + hammingWeight(64));
        System.out.println("HW -15:" + hammingWeight(15));

    }
            }



