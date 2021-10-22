package com.JavaBootCamp.ObjectOrientedProgramming.Polymorphism;

public class MySuperKeyword {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.work();
    }
}
class Animal{
    Animal(){System.out.println("animal is created");}
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    Dog(){
        super();    //  invoking parent class constructor
        System.out.println("dog is created");
    }
    void eat(){System.out.println("eating bread...");}
    void bark(){System.out.println("barking...");}
    void work() {
        super.eat();   //invoking parent class method 
        bark();
    }
}