package com.JavaBootCamp.ObjectOrientedProgramming.Inheritence;

public class MyHierarchicalInhertance {
    public static void main(String[] args) {
        Car objc = new Car();
        objc.run();
        objc.move();
        Bike objet = new Bike();
        objet.changeGear();
        objet.move();
    }
}

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Bike extends Vehicle {
    void changeGear() {
        System.out.println("Bike has 2 wheels");
    }
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car has 4 wheels ,so it can go in motion to run");
    }
}