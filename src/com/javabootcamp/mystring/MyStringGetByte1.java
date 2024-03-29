package com.javabootcamp.mystring;

import java.nio.charset.StandardCharsets;

public class MyStringGetByte1 {

    public static void main(String[] args) {
        String str = "Welcome to Iedaas.";
        System.out.println("The input String is : ");
        System.out.println(str + "\n");
        //16 - bit UCS Transformation format
        byte[] byteArr = str.getBytes(StandardCharsets.UTF_16);
        System.out.println("After converted into UTF-16 the String is : ");

        for (int j = 0; j < byteArr.length; j++) {
            System.out.print(byteArr[j]);
        }

        System.out.println("\n");

        // Big Endian byte order, 16 - bit UCS Transformation format
        byte[] byteArr1 = str.getBytes(StandardCharsets.UTF_16BE);
        System.out.println("After converted into UTF-16BE the String is : ");

        for (int j = 0; j < byteArr1.length; j++) {
            System.out.print(byteArr1[j]);
        }

        System.out.println("\n");

        // ISO Latin Alphabet
        byte[] byteArr2 = str.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println("After converted into ISO-8859-1 the String is : ");

        for (int j = 0; j < byteArr2.length; j++) {
            System.out.print(byteArr2[j]);
        }

        System.out.println("\n");

        // Little Endian byte order, 16 - bit UCS Transformation format
        byte[] byteArr3 = str.getBytes(StandardCharsets.UTF_16LE);
        System.out.println("After converted into UTF-16LE the String is : ");

        for (int j = 0; j < byteArr3.length; j++) {
            System.out.print(byteArr3[j]);
        }
    }
}