package com.basics.loopingStatement;

import java.util.Scanner;

public class PrintEvenOddInRange {
    static void main() {
        System.out.println("Enter the range:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n){
            if(i % 2 ==0) {
                System.out.println(n + " is Even");
            }else {
                System.out.println(i + " is ODD");
            }
            i++;
            }
        }
    }

