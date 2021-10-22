package com.javabootcamp.myarrays;

public class MyArrays {
    static void min(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
            if(min>arr[i])
                min=arr[i];

        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr =new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=70;
        arr[3]=40;
        arr[4]=50;
        for (int i : arr) System.out.println(i);

        // passing array to method
        int[] arr1 ={33,3,4,5};//declaring and initializing an array
        min(arr1);//passing array to method
    }
}
