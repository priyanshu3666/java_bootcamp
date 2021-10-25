package com.javabootcamp.multithreading;


class TestPriority extends Thread{
    public void run(){
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
        System.out.println("running thread name is:"+Thread.currentThread().getName());


    }
    public static void main(String args[]){
        TestPriority m1=new TestPriority();
        TestPriority m2=new TestPriority();
        m1.setPriority(1);
        m2.setPriority(8);
        m1.start();
        m2.start();

    }
}
