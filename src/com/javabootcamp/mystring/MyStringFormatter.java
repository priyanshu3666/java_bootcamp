package com.javabootcamp.mystring;

public class MyStringFormatter {
    public static void main(String[] args){
        String name="soon";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0
        String sf4 = String.format("%x", 101);
        String str1 = String.format("%d", 101);
        String str2 = String.format("|%10d|", 101);  // Specifying length of integer
        String str3 = String.format("|%-10d|", 101); // Left-justifying within the specified width
        String str4 = String.format("|% d|", 101);
        String str5 = String.format("|%010d|", 101);

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
        System.out.println(sf4);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
    }
}
