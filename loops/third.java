package com.loops;

import java.util.Scanner;

public class third {
    public static void main(String args[]) {
        int n;
        System.out.print("Enter The value of n : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            if ((i % 2 == 0) && (i / 2 != 0)) {
                System.out.println(i);
            }
        }
    }
}
