package com.basics.opps.thisKeywordExample;

public class Demo {
    // Instance variable
    String  i;
    void change(int x){
        this.i = i;
    }
    void display(){
        System.out.println("This value of i is:" + i);
    }
    public static void main(String[] args){
        Demo obj = new Demo();
        obj.change(10);
        obj.display();
    }
}
