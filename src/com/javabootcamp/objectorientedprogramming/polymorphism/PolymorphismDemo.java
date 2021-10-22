package com.javabootcamp.objectorientedprogramming.polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Man obj = new Millionaire();
        obj.pay();
    }
}
class Man{
    void pay(){
        System.out.println("Paying Bill");
    }
}
class  Millionaire extends  Man{
    void pay(){
        System.out.println("Millionaire is Paying Bill and also giving tips");
    }
    
}
