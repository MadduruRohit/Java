package com.loops;

import java.util.Scanner;

public class Thirteen {
    public static void main(String args[]) {
        int a = 10, b = 20, c = 30;
        if (a > b && a > c) {
            System.out.println(a + " is the Greatest Number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the Greatest Number");
        } else {
            System.out.println(c + " is the Greatest Number");
        }
    }
}


