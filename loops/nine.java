package com.loops;

import java.util.Scanner;

public class nine {

    static boolean checkPrime(int n) {
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        boolean isPrime = checkPrime(n);
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
