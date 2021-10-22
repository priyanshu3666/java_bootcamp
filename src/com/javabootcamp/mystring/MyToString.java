package com.javabootcamp.mystring;

class Student{
    int roll;
    String name;
    String city;

    Student(int roll, String name, String city){
        this.roll = roll;
        this.name=name;
        this.city=city;
    }

    public String toString(){//overriding the toString() method
        return roll +" "+name+" "+city;
    }

}
public  class MyToString{
    public static void main(String[] args){
        Student s1=new Student(101,"Raj","lucknow");
        Student s2=new Student(102,"Vijay","ghaziabad");

        System.out.println(s1);   //compiler writes here s1.toString()
        System.out.println(s2);   //compiler writes here s2.toString()
    }
}