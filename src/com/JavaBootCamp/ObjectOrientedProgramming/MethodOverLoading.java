package com.JavaBootCamp.ObjectOrientedProgramming;

public class MethodOverLoading {
    public void display(int x){
        System.out.println("welcome to integer");
    }
    public void display(String str){
        System.out.println("Welcome to String");
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        String str1 = "Welcome Priyanshu";
        obj.display(str1);
        obj.display(10);
    }

}
