package com.javabootcamp.objectorientedprogramming.inheritance;

public class SingleInheritance {
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();

}  }
class Animal{
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}


