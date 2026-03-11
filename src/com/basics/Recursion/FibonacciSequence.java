package com.basics.Recursion;

public class FibonacciSequence {
    public static int fibonacci(int n){
        // Base Case
        if (n == 0 || n ==1){
            return n;

        }
        return fibonacci(n-1) + fibonacci(n-2);

    }

    static void main() {
        System.out.println(fibonacci(7));
    }
}
