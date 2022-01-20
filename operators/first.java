package com.operators;
import  java.util.Scanner;
public class first {

    //Addition Operator
    static int Addition(int a , int b){
      return a + b;
    }

    //Subtraction Operator
    static int Subtraction(int a , int b){
        return a - b;
    }

    //Multiplication Operator
    static int Multiplication(int a , int b){
        return a * b;
    }

    //Division Operator
    static int Division(int a , int b){
        return a / b;
    }

    public static  void main(String args[]){
     int a,b;
     System.out.print("Enter the values of a : and b : ");
     Scanner sc = new Scanner(System.in);
     a = sc.nextInt();
     b = sc.nextInt();
     System.out.println("Addition : " + Addition(a,b));
     System.out.println("Subtraction : " + Subtraction(a,b));
     System.out.println("Multiplication : " + Multiplication(a,b));
     System.out.println("Division : " + Division(a,b));
    }
}
