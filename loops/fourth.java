package com.loops;

import java.util.Scanner;

public class fourth {

    static void check(int a){
        if(a % 2 == 0){
            System.out.println(a + " is Even");
        }
        else {
            System.out.println(a + " is Odd");
        }
    }
    public static void main(String args[]) {
     int a;
     System.out.print("Enter a value: ");
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();
     check(a);
    }
}
