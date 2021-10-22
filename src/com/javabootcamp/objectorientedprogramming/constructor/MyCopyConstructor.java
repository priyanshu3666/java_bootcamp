package com.javabootcamp.objectorientedprogramming.constructor;

public class MyCopyConstructor {
    int id;
    String name;

    //constructor to initialize integer and string
    MyCopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    //constructor to initialize another object
   MyCopyConstructor(MyCopyConstructor s) {
        id = s.id;
        name = s.name;
    }

    public static void main(String[] args) {
        MyCopyConstructor s1 = new MyCopyConstructor(111, "Karan");
        MyCopyConstructor s2 = new MyCopyConstructor(s1);
        s1.display();
        s2.display();
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

