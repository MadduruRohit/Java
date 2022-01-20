package com.operators;
import java.util.Scanner;
public class seventh {

    static  void check(int n, int a , int b){
        if(n > a && n > b ){
            System.out.println(n + " is the Larget Number " );
        }
        else if(n < a ){
            System.out.println(n + " is the Smallest Number " );
        }
    }
    public static void main(String args[]) {
        int a = 20 , b = 30;
        int n;
        System.out.print("Enter the value of n : ");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();
        check(n, a, b);
    }


}
