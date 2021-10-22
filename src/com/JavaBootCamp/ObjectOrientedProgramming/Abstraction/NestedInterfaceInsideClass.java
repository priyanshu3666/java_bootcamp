package com.JavaBootCamp.ObjectOrientedProgramming.Abstraction;

public class NestedInterfaceInsideClass implements A.Message {
    public static void main(String[] args) {
        A.Message message = new NestedInterfaceInsideClass();//upcasting here
        message.msg();
    }

    public void msg() {
        System.out.println("Hello nested interface");
    }
}

class A {
    interface Message {
        void msg();
    }
}

