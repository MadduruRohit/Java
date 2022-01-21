package com.loops;

import java.util.Scanner;

public class eleventh {

    public static void main(String args[]) {
        int n;
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        switch (n % 2) {
            case 0: {
                System.out.print("Number is Even");
                break;
            }
            case 1: {
                System.out.print("Number is Odd");
                break;
            }
        }
    }
}
