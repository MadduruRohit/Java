package com.arrays;

import java.util.Scanner;

public class fifth {

    static void index(int arr[], int n) {
        for (int i = n; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n;
        int arr[] = {3, 8, 6, 7, 9, 3, 12, 66, 9, 5};
        int len = arr.length;
        System.out.println("Select the No from the below Array to get Index - ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Enter the Index which Should be removed : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        index(arr, n);
    }
}
