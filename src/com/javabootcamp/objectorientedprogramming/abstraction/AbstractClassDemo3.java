package com.javabootcamp.objectorientedprogramming.abstraction;

public class AbstractClassDemo3 {
    public static void main(String args[]){
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
    public static void main(int args[]){
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
    public static void main(double args[]){
        Bike1 obj = new Honda1();
        obj.run();
        obj.changeGear();
    }
}
//example of abstract class that have method body
abstract class Bike1{
    Bike1(){System.out.println("bike is created");}

    final static void run() {
        
    }

    abstract  void changeGear();
}

class Honda1 extends Bike1{
    @Override
    void changeGear() {
        {System.out.println("gear changed");}
    }
}



