package com.basics.Recursion;

public class SumOfNTerms {
    public static int sum(int n){
        // Base Case : if n == 0 -> just return 0
        if (n == 0){
            return  0;

        }
        return  n + sum(n-1);

    }

    static void main() {
        System.out.println(sum(10));
        System.out.println(sum(100));
        System.out.println(sum(5));
    }
}
