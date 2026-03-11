package com.basics.exceptions; // Multi catch block by index

public class E2 {
    static void main() {
        int i, j, k=0;
        i = 10;
        j = 2;
        try {
            k = i / j;
            String str = "SNPSU";
            System.out.println(str.charAt(9));
        }catch (ArithmeticException | StringIndexOutOfBoundsException e){
            System.out.println("Error");
        }
        System.out.println("The value of k is:" +k);
    }
}
