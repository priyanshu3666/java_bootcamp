package com.JavaBootCamp.MyArrays;

public class AnonymousArray {
    //creating a method which receives an array as a parameter
    static void printArray(int[] arr) {
        for (var ignored : arr) System.out.println(ignored);
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 22, 66, 44});//passing anonymous array to method


        //cloning array
        var arr1 = new int[]{33, 3, 4, 5};
        System.out.println("Printing original array:");
        for (var i : arr1)
            System.out.println(i);

        System.out.println("Printing clone of the array:");
        var carr = arr1.clone();
        for (var i : carr)
            System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr1 == carr);
    }
}
