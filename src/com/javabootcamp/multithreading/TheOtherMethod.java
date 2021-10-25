package com.javabootcamp.multithreading;


public class TheOtherMethod extends Thread{
    public void run(){
        System.out.println("running...");
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args){
        TheOtherMethod t1=new TheOtherMethod();
        TheOtherMethod t2=new TheOtherMethod();
        System.out.println("Name of t1:"+t1.getName());
        System.out.println("Name of t2:"+t2.getName());
        System.out.println("id of t1:"+t1.getId());

        t1.start();
        t2.start();

        t1.setName("Priyanshu");
        System.out.println("After changing name of t1 : "+t1.getName());
    }
}
