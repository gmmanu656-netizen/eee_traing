package com.basics.arrays;

import java.util.Arrays;

public class E4 {
    public static void main(String[] args) {
        int[][]number={{1,2,4,5},{4,6,4},{4,5,},{9}};
        for (int[] x:number){
            for(int n:x){
                System.out.print(n+ " ");
            }
        }
        System.out.println();
        char[][] names={{'s','m','i','o','n'},
                {'f','a','h','d','k'},
                {'d','t','h','u','o'},
                {'f','t','y','h','g'},
                {'m','a','n','u','f','k','s','u'}};
        for (char [] ch:names){
            for(char c:ch){
                System.out.print(c +" ");
            }
            System.out.println();
        }
    }
}