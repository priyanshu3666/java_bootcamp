package com.javabootcamp.multithreading;

public class TestDaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){//checking for daemon thread
            System.out.println("daemon thread work");
        }
        else{
            System.out.println("user thread work");
        }
    }
    public static void main(String[] args){
        TestDaemonThread t1=new TestDaemonThread();
        TestDaemonThread t2=new TestDaemonThread();
        TestDaemonThread t3=new TestDaemonThread();

        t1.setDaemon(true);//now t1 is daemon thread

        t1.start();
        t2.start();
        t3.start();
    }
}