package com.JavaBootCamp.MyString;

public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Hello ");
        //inserting
        sb.insert(1,"Java");//now original string is changed
        System.out.println(sb);
        //replacing
        sb.replace(1,3,"Java");
        System.out.println(sb);
        //delete
        sb.delete(1,3);
        System.out.println(sb);
        //reversing
        sb.reverse();
        System.out.println(sb);
        //capacity
        System.out.println(sb.capacity());//default 16
        sb.append("Hello");
        System.out.println(sb.capacity());//now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        //ensure capacity
        System.out.println("Before ensuring the capacity :"+ sb.capacity());
        sb.ensureCapacity(50);
        System.out.println("After ensuring the capacity :"+sb.capacity());
    }
}
