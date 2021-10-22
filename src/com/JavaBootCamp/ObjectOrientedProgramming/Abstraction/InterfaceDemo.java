package com.JavaBootCamp.ObjectOrientedProgramming.Abstraction;

interface OperateCar {
    void  switchOn();
    void turn();
    void speedUp();
    void applyBrakes();
}

public class InterfaceDemo implements OperateCar {
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.print();
        obj.switchOn();
        obj.turn();
        obj.speedUp();
        obj.applyBrakes();
    }
        public void print() {
        System.out.println("Hello");
    }
    public void switchOn() {
        System.out.println("Your car is started");
    }
    @Override
    public void turn() {
        System.out.println("You turned right");
    }
    @Override
    public void speedUp() {
        System.out.println("speedup by 10 kmps");
    }
    @Override
    public void applyBrakes() {
        System.out.println("speed down by 10kmps");
    }
}

