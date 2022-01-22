package com.arrays;

public class eleventh {

    static void findCommon(int arr[], int arr1[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    System.out.println("The Common Elements are : " + arr[i] + " \n");
                }
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = {34, 9, 65, 21, 54};
        int arr1[] = {99, 67, 22, 54, 9};
        findCommon(arr, arr1);
    }
}
