package com.javabootcamp.collections;
import java.util.*;

public class ArrayList2
{
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Traversing list through List Iterator in reversal :");
        //Here, element iterates in reverse order
        ListIterator<Integer> list1=list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            int str=list1.previous();
            System.out.println(str);
        }
        System.out.println("Traversing list through for loop:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("Traversing list through forEach() method:");
        //The forEach() method is a new feature, introduced in Java 8.
        list.forEach(a->{
            System.out.println(a);
        });

        System.out.println("Traversing list through forEachRemaining() method:");
        Iterator<Integer> itr=list.iterator();
        itr.forEachRemaining(a->
        {
            System.out.println(a);
        });
    }
} 
