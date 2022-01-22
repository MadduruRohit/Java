package com.arrays;

import java.util.Scanner;

public class seventh {
    static void index(int arr[], int n, int v) {
        for (int i = arr.length; i <= n; i--) {
            arr[i + 1] = arr[i];
        }
        arr[n] = v;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n, v;
        int arr[] = {3, 8, 6, 7, 9, 3, 12, 66, 9, 5};
        int len = arr.length;
        System.out.println("Select the No from the below Array to get Index - ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        System.out.print("Enter the Number And Its Position : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        v = sc.nextInt();
        index(arr, n, v);
    }

}
