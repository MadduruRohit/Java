package com.arrays;

import java.util.Scanner;

public class seventeen {

    static void isPresent(int arr[], int key, int key1) {
        boolean set12 = false;
        boolean set23 = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                set12 = true;
            }

            if (arr[i] == key1) {
                set23 = true;
            }
        }
        if (set12) {
            System.out.println("Elements 12 is present in the Array");
        } else {
            System.out.println("Elements 12 is not present in the Array");
        }

        if (set23) {
            System.out.println("Element 23 is present in the Array");
        } else {
            System.out.println("Elements 23 is not present in the Array");
        }
    }

    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int key, key1;
        key = 12;
        key1 = 23;
        isPresent(arr, key, key1);


    }

}
