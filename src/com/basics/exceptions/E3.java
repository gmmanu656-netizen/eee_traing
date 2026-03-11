package com.basics.exceptions;

public class E3 {
    static void checkAge(int age){
        if(age >= 18){
            System.out.println("Acecess Granted - Eligible.");
        }else{
            throw new RuntimeException("Access Denied - Not Eligible.");
        }
        System.out.println("User starts the app");
    }
    static void main() {
        checkAge(20);


    }
}
