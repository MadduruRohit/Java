package com.loops;

import java.util.Scanner;

public class fifth {

    static void FindLargest(int a, int b, int c) {
        int largest;
        if (a > b && a > c) {
            largest = a;
        } else if (b > a && b > c) {
            largest = b;
        } else {
            largest = c;
        }
        System.out.println(largest + " Is The Greatest Number");
    }

    public static void main(String args[]) {
        int a, b, c;
        System.out.print("Enter Three Values : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        FindLargest(a, b, c);
    }
}
