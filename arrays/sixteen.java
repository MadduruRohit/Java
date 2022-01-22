package com.arrays;

import java.util.Scanner;


public class sixteen {

    static int getDifference(int arr[]) {
        int min = arr[0], max = arr[1], difference = 0;
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                max = arr[i];
            }
        }
        return max - min;
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
        int ans = getDifference(arr);
        System.out.println("The difference Between the Min & Max Values of the Array are : " + ans);
    }
}
