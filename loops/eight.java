package com.loops;

import java.util.Scanner;

public class eight {

    static int cube(int a) {
        return (a * a * a);
    }

    static int armstrong(int n) {
        int totalSum = 0, ans, sum;
        while (n != 0) {
            ans = n % 10;
            sum = cube(ans);
            totalSum = totalSum + sum;
            n = n / 10;
        }
        return totalSum;
    }

    public static void main(String args[]) {
        int n;
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sol = armstrong(n);
        if (sol == n) {
            System.out.println("Its an Armstrong Number");
        } else {
            System.out.println("Its not an Armstrong Number");
        }
    }
}
