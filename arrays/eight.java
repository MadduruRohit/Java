package com.arrays;

import java.util.Scanner;

public class eight {

    static void getMaxMin(int arr[]) {
        int min = arr[0], max = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }

        System.out.println("Minimum Value is : " + min + " Maximum Value is : " + max);
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
        getMaxMin(arr);
    }
}
