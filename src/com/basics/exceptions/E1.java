package com.basics.Exceptions;

public class E1 {
    public static void main(String[] args) {
        int i,j,k=0;
        i=10;
        j=10;
        try{
            k=i/j;
            String name="java";
            System.out.println(name.charAt(6));//intellisense
        }catch(ArithmeticException e){
            System.out.println("cannot divide by zero");
            e.printStackTrace();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("the index of string is OOB");
        }
        System.out.println("the value of k is:"+k);
    }
}