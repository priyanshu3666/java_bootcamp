package com.JavaBootCamp.Arrays;

public class DuplicateElement {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {45 , 32, 31, 4, 8, 32, 45, 8};
        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}
