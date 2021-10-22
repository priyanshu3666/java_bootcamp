package com.javabootcamp.objectorientedprogramming.polymorphism;

public class FinalKeywordImplementation {

    public static void main(String args[]){
        Honda honda= new Honda();
        
    }
}

class Bike{
    final int speedlimit;
    public Bike() {
        {
            speedlimit=70;
            System.out.println(speedlimit);
        }
    }

    final void run(){System.out.println("running");}
}

class Honda extends Bike{
    Honda(){
        super.run();
    }

}
