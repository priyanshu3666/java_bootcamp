package com.javabootcamp.exceptionhandling;

public class FinalizeExample {
    public static void main(String[] args)
    {
        FinalizeExample obj = new FinalizeExample();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()
        System.gc();
        System.out.println("End of the garbage collection");
    }
    // defining the finalize method
    public void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}