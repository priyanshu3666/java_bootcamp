package com.JavaBootCamp.Arrays;
import java.util.Arrays;
public class ArrayDemo{
    public static void main(String[] args) {
        char[] source = {'H','A','P','P','Y','L','E','A','R','N','I','N','G'};
        char[] destination = new char[7];

        //copying element of one array to another
        System.arraycopy(source,0,destination,0,5);
        System.out.println(destination);

        //deleting element from array
        int flag = 3;  //element to bee delete
        for (int index = 0; index < source.length; index++) {
            if (flag == index)
            {
                for (int j = index+1; j < source.length -1; j++) {
                    source[index] = source[j];
                    index++;
                }
                System.out.println(source);
            }
        }
    }

}
