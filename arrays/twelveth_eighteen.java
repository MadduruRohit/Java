package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class twelveth_eighteen {

    static void removeDuplicate(int arr[], int len) {
        Arrays.sort(arr);
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[len - 1];

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        int len = arr.length;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " : ");
            arr[i] = sc.nextInt();
        }
        removeDuplicate(arr, len);
    }
}
