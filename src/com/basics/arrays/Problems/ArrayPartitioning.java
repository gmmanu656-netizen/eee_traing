package com.basics.arrays.Problems;

import java.util.Arrays;

// Even on the LHS & Odd on the RHS
public class ArrayPartitioning {
    static void main() {
        int[] arr = {3, 8, 5, 1, 27, 6};
        System.out.println(Arrays.toString(arr));
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (arr[l] % 2 == 0) {
                l++; // If even numbers are at correct place, move ahead
            }
            if (arr[r] % 2 != 0) {
                r--; // If numbers are at correct place , move behind
            }
            if (l < r) { // they are not at correct place , swap them
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
