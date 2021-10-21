package com.JavaBootCamp.MyString;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("my name is priyanshu", " ");
        while (st.hasMoreTokens())  //hasMoreTokens method
        {
            System.out.println(st.nextToken()); // nextToken method
        }
        StringTokenizer st1 = new StringTokenizer("Hello everyone I am a Java developer", " ");
        while (st1.hasMoreElements()) //hasMoreElements method
        {
            System.out.println(st1.nextToken());  //nextToken method
        }
        StringTokenizer st3 = new StringTokenizer("Hello Everyone Have a nice day", " ");
        System.out.println("Total number of Tokens: " + st3.countTokens());    // countTokens method

    }
}
