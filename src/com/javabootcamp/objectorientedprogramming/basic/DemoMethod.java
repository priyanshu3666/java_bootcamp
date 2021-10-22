package com.javabootcamp.objectorientedprogramming.basic;

public class DemoMethod {
    public int addNumbers(int num1,int num2){
        int res = num1+num2;
        return res;
    }

    public static void main(String[] args) {
        DemoMethod obj = new DemoMethod();
        int ans = obj.addNumbers(4,6);
        System.out.println("Answer is :"+ ans);
    }
}
