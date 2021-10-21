package com.JavaBootCamp.MyString;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "Happy";
        System.out.println("The str1 points to :"+str1);
        System.out.println("The str1 is concat with 'learning' :" + str1.concat("Learning"));
        System.out.println("The str1 still  points to :"+str1);
        str1 = str1.concat("Learning");
        System.out.println("The str1 now   points to new assigned value i.e :"+str1);
        System.out.println("To uppercase :"+str1.toUpperCase());
        System.out.println("to lowercase :"+str1.toLowerCase());

        //valueOf() method
        int num = 50;
        String str2 = String.valueOf(num);
        System.out.println("The value of str2 is :"+str2);

        //replace
        str2 =str2.replace("0","50");
        System.out.println("the new value of str2 after replacing 0 with 4 : "+str2);

        //contains
        System.out.println("The str2 contains 0 or not :"+str2.contains("0"));
        System.out.println("The str2 contains 8 or not :"+str2.contains("8"));

        //equals
        String str3 = "Hello";
        String str4 = "hELLo";
        System.out.println("str3 is compared to str4 using equal method :"+str3.equals(str4));
        System.out.println("str3 is compared to str4 using equalIgnoreCase method :"+str3.equalsIgnoreCase(str4));

        //compareTo
        System.out.println("str3 is compared to str4 using compareTo method :"+ str4.compareTo(str3));

        System.out.println("retrieving the length of str1 using length method :"+ str1.length());
        System.out.println("retrieving the substring  of str1 using substring method :"+ str1.substring(2));
        System.out.println("retrieving the Character of str1 using charAt method :"+ str1.charAt(5));
        System.out.println("checking whether str1 is ending with 'l' or not using endWith method :"+ str1.endsWith("l"));



    }
}
