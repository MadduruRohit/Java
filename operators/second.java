package com.operators;

import java.util.Scanner;

public class second {
    static int increment(int a) {
        return a + 1;
    }

    static int decrement(int a) {
        return a - 1;
    }

    public static void main(String args[]) {
        int a;
        System.out.print("Enter a value : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println(increment(a));
        System.out.println(decrement(a));
    }
}
