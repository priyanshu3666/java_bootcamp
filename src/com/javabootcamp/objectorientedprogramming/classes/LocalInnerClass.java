package com.javabootcamp.objectorientedprogramming.classes;

public class LocalInnerClass {
    private final int data = 30;//instance variable

    public static void main(String[] args) {
        LocalInnerClass obj = new LocalInnerClass();
        obj.display();
    }

    void display() {
        int value = 50;//local variable must be final till jdk 1.7 only
        class Local {
            void msg() {
                System.out.println("value =" + value);
                System.out.println("data =" + data);
            }
        }
        Local l = new Local();
        l.msg();
    }
}
