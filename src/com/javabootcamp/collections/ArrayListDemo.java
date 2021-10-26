package com.javabootcamp.collections;

import java.util.*;

import java.util.*;
public class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<String> al=new ArrayList<String>();//Creating arraylist
        al.add("Mango");//Adding object in arraylist
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");
        //Printing the arraylist object
        //accessing the element
        System.out.println("Returning element: "+al.get(1));//it will return the 2nd element, because index starts from 0
        //changing the element
        al.set(1,"Dates");
        //Traversing list
        for(String fruit:al)
            System.out.println(fruit);
        //for sorting
        Collections.sort(al);
        System.out.println();
        System.out.println(al);
    }
}