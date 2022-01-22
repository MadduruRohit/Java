package com.arrays;

import java.util.Scanner;

public class fourth {

    static boolean check(int arr[], int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
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
        int key;
        System.out.print("Enter the value which should be searched : ");
        key = sc.nextInt();
        boolean isPresent = check(arr, key);

        if (isPresent) {
            System.out.print("Value is Present");
        } else {
            System.out.print("Value is Not Present");
        }

    }
}
