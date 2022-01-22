package com.arrays;

import java.lang.reflect.Array;
import java.util.Collections;


public class ninth {

    static void reverse(int arr[]){
        int len, s , e , temp;
        len = arr.length;
        s = 0;
        e = len - 1;
        while (s < e){
           temp = arr[s];
           arr[s] = arr[e];
           arr[e] = temp;
            s++;
            e--;
        }
        System.out.println("\nReversed Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        int arr[] = {3, 8, 6, 7, 9, 3, 12, 66, 9, 5};
        System.out.println("Original Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        reverse(arr);

    }
}
