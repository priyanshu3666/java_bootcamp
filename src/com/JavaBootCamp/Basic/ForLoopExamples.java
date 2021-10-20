package com.JavaBootCamp.Basic;

public class ForLoopExamples {
    public static void main(String[] args) {
        //simple for loop
        for(int num=1;num<=10;num++){
            System.out.print(num+" ");
        }
        System.out.println();

        //nested for loop
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }
        }

        //Pyramid
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // For each loop
        int arr[]={12,23,44,56,78};
        for(int num:arr) {
            System.out.println(num);
        }

    }
}
