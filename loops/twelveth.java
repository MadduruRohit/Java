package com.loops;

import java.util.Scanner;

public class twelveth {


    public static void main(String args[]) {
        char n;
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        n = sc.next().charAt(0);

        switch (n) {
            case 'M':
            case 'm': {
                System.out.print("Male");
                break;
            }

            case 'F':
            case 'f': {
                System.out.print("Female");
                break;
            }
            default: {
                System.out.print("Invalid Character");
            }
        }
    }
}
