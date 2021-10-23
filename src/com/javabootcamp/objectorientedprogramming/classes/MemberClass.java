package com.javabootcamp.objectorientedprogramming.classes;

class MemberClass {
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        MemberClass obj=new MemberClass();
        MemberClass.Inner in=obj.new Inner();
        in.msg();
    }
}  