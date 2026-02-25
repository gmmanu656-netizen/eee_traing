package com.basics.method;

public class Example6 {
    static int reverse_integer(int n) {
        int ans = 0;
        while (n > 0) {
            int digit = n % 10;
            ans = ans * 10 + digit;
            n = n / 10;
        }
        return ans;
    }

    static void main() {
        System.out.println(reverse_integer(123));
        System.out.println(reverse_integer(120));
    }

    }

