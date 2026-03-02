package com.basics.oppsPillars.single;

public class Animal {
    void eat(){
        System.out.println("Animal eats some food!");
    }
}
class Cat extends Animal {
    void run(){
        System.out.println("Cats run very fast.");
    }

    static void main() {
        Cat cat = new Cat();
        cat.run();
        cat.eat();
    }
}