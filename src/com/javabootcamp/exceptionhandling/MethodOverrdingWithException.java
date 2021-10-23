package com.javabootcamp.exceptionhandling;

import java.io.*;

/**
 * If the superclass method does not declare an exception, subclass overridden method cannot declare the
 * checked exception but can declare unchecked exception.
 */

class Parent {
    void msg() {
        System.out.println("parent method");
    }
}

public class MethodOverrdingWithException extends Parent {
    public static void main(String[] args) {
        Parent p = new MethodOverrdingWithException();
        p.msg();
    }

    void msg() throws ArithmeticException {
        System.out.println("child method");
    }
}


