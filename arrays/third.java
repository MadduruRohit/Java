package com.arrays;

import java.util.Scanner;

public class third {

    static void index(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(n + " is found at index " + i);
            }
        }
    }

    public static void main(String args[]) {
        int n;
        int arr[] = {3, 8, 6, 7, 9, 3, 12, 66, 9, 5};

        System.out.println("Select the No from the below Array to get Index - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Enter the Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        index(arr, n);
    }
}
