package com.loops;

import java.util.Scanner;

public class tenth {

    static int palindrome(int a) {
        int value = 0;
        while (a != 0) {
            int reverse = a % 10;
            value = value * 10 + reverse;
            a = a / 10;
        }
        return value;
    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int value = palindrome(n);
        if (value == n) {
            System.out.println("Yes Its an Palindrome Number");
        } else {
            System.out.println("No Its not an Palindrome Number");
        }
    }
}
