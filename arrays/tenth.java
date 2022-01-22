package com.arrays;

public class tenth {
     static void duplicate(int arr[]){
         for (int i = 0; i < arr.length - 1; i++) {
             for (int j = i + 1; j < +arr.length; j++) {
                 if (arr[i] == arr[j]) {
                     System.out.println("The duplicate Values are : " + arr[i]);
                 }
             }
         }
}
    public static void main(String args[]) {
        int arr[] = new int[]{2, 8, 4, 2, 5, 6, 3};
        duplicate(arr);
    }
}
