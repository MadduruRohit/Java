package com.arrays;

import java.util.Arrays;
import java.util.Random;

public class nineteenth {

    static void FindMissing(int arr[]) {
        Arrays.sort(arr);
        boolean present[] = new boolean[arr.length];
        Arrays.fill(present, Boolean.FALSE);
        for (int i = 0; i < arr.length -1 ; i++){
            if(arr[i] == i){
                present[i] = true;
            }
        }
        for (int i = 0; i <arr.length-1 ; i++){
            System.out.println(arr[i] + " ");
        }
        for (int i = 0; i < present.length-1 ; i++){
            System.out.println(present[i] + " ");
        }
        for (int i = 0; i < present.length-1 ; i++){
            if(present[i] == false){
                System.out.println("The missing numbers are : " + i);
            }
        }


    }

    public static void main(String args[]) {
        int arr[] = new int[]{5,1,4,1,8,9,10,4,8};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 100);
//        }
        FindMissing(arr);
    }
}
