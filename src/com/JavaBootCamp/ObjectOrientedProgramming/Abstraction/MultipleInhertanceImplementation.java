package com.JavaBootCamp.ObjectOrientedProgramming.Abstraction;

public class MultipleInhertanceImplementation implements  Printable,Showable {
    public void print(){System.out.println("Hello");}
    public void show(){System.out.println("Welcome");}

    public static void main(String[] args){
        MultipleInhertanceImplementation obj = new MultipleInhertanceImplementation();
        obj.print();
        obj.show();
    }
}

interface Printable{
    void print();
}
interface Showable {
    void show();
}
