package com.JavaBootCamp.ObjectOrientedProgramming.Abstraction;

interface Showable1 {
    void show();

    interface Message1 {
        void msg();
    }
}

public class NestedInterface implements Showable1.Message1 {
    public static void main(String[] args) {
        Showable1.Message1 message = new NestedInterface();//upcasting here
        message.msg();
    }

    public void msg() {
        System.out.println("Hello nested interface");
    }
}
