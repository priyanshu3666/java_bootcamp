package com.JavaBootCamp.ObjectOrientedProgramming;

public class MyStaticImplementation {
    static String college = "ITS";//static variable
    int roll;//instance variable
    String name;

    //constructor
    MyStaticImplementation(int r, String n) {
        roll = r;
        name = n;
    }
    //method to display the values
    void display() {
        System.out.println(roll + " " + name + " " + college);
    }

    static int cube(int x){
        return x*x*x;
    }

    //Test class to show the values of objects
    public static void main(String[] args) {
        MyStaticImplementation s1 = new MyStaticImplementation(111, "Karan");
        MyStaticImplementation s2 = new MyStaticImplementation(222, "Aryan");
        //we can change the college of all objects by the single line of code
        //MyStaticImplementation.college="BBDIT";
        s1.display();
        s2.display();
        System.out.println(cube(4));
    }


}
