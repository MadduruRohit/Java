package com.arrays;

public class sixth {


    static void match(int arr[]) {
        // Method 1 :
        int copy[] = arr;
        // Method 2 :
        // int copy[] = new int[arr.length];
        // System.arraycopy(arr,0,copy,0,arr.length);
        // Method 3 :
        // for(int i = 0; i < arr.length; i++){
        //      arr[i] = copy[i];
        //  }
        System.out.println(" \n Values Copied From Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        match(arr);

    }
}
