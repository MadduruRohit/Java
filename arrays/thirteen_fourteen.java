package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class thirteen_fourteen {

    static void secondLargest(int arr[]) {
        int len = arr.length;
        Arrays.sort(arr);
        System.out.print(arr[arr.length - 2] + " is the Second Largest Number in the Array");
    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " : ");
            arr[i] = sc.nextInt();
        }
        secondLargest(arr);
    }

}
