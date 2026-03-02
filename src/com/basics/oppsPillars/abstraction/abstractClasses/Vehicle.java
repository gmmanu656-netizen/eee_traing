package com.basics.oppsPillars.abstraction.abstractClasses;

abstract class Vehicle {
    //ℹ️ Two types of methods:
    // 1. Normal or concrete
    void vehicle_type(){
        System.out.println("Two wheeler or four wheeler");
    }
    // 2. Abstract Method
    abstract void start();
    // This abstract method will be defined in the child class
    // if they are only abstract method - 100% abstraction
    // if there is even 1 normal method - not 100% abstraction
}
class Meteor350 extends Vehicle{
    @Override
    void start() {
        System.out.println(" Meteor350 start with Self.");
    }
}
class TataHexa extends Vehicle{

    @Override
    void start() {
        System.out.println(" Hexa start with key");
    }
}
class Demo {
    static void main() {
        Meteor350 bike = new Meteor350();
        TataHexa car = new TataHexa();
        bike.start();
        bike.vehicle_type();
        car.start();
        car.vehicle_type();
    }
}