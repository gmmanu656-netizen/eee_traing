package com.basics.opps.diamondProblem;

public interface Cat {
    default void sound(){
        System.out.println("Meow!");
    }
}
interface Dog{
    default void sound(){
        System.out.println("Woof!");
    }
}
class Cog implements Cat, Dog{
    public void sound(){
        // you can use any one of these - it removes ambiguity
        // System.out.println("Some new sound!!!");
        // Dog.super.sound();
        System.out.println("Some new sound!!");
        Cat.super.sound();
    }
}
class Demo {
    static void main() {
        Cog cog = new Cog();
        cog.sound();
    }
}