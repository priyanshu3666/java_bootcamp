package com.javabootcamp.objectorientedprogramming.inheritance;

public class MyMultilevelInhertance {
    public static void main(String[] args) {
        Cycle obj = new Cycle();
        obj.run3();
        obj.run2();
        obj.run1();
    }
}
class Vehicle1{
    void run1()
    {
        System.out.println("Vehicle is parent class");
    }
}
class Bike1 extends  Vehicle1{
    void run2()
    {
        System.out.println("bike has some properties of vehicle");
    }
}

class  Cycle extends  Bike1{
    void run3() {
        System.out.println("Cycle has some properties of bike");
    }
}
