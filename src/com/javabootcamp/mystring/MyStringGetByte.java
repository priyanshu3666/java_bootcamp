package com.javabootcamp.mystring;

public class MyStringGetByte {
    public static void main(String[] args) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (byte b : barr) {
            System.out.println(b);
        }
        // Getting string back
        String s2 = new String(barr);
        System.out.println(s2);
    }
}
