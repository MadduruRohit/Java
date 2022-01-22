package com.arrays;

import java.util.Scanner;

public class fifteen {

    static void FindOddEven(int arr[]) {
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of Odd Elements in Array are : " + odd);
        System.out.println("Number of Even Elements in Array are : " + even);

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
        FindOddEven(arr);
    }
}
