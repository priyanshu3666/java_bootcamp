package com.javabootcamp.multithreading;

public class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Now the thread is running ...");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args)
    {

        Runnable r1 = new MyThread2();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "My new thread");
        th1.start();

        // getting the thread name by getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}