package com.javabootcamp.objectorientedprogramming.abstraction;

interface Drawable {
    void draw();
    default void msg() {
        System.out.println("default method");
    }
}

public class AccessModifierInInterface {
    public static void main(String[] args) {
        Drawable obj = new Rectangle();
        obj.draw();
        obj.msg();
    }
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
