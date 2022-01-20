package com.operators;

public class sixth {

    public static void main(String args[]) {
        int a = 15, b = 27, c = 20, d = 89,e = 666;

        // "<" checks if the value is less than the given values
        if( a < b){
            System.out.println("Statement 1 is True");
        }
        else{
            System.out.println("Statement 1 is False");
        }

        // ">" checks if the value is greater than the given values
        if(e > c){
            System.out.println("Statement 2 is True");
        }
        else{
            System.out.println("Statement 2 is False");
        }

        // "<=" checks if the value is less than or equal to the given value
        if(b <= a){
            System.out.println("Statement 3 is True");
        }
        else {
            System.out.println("Statement 3 is False");
        }

        // ">=" checks if the value is greater than or equal to the given value
        if(d >= c){
            System.out.println("Statement 4 is True");
        }
        else {
            System.out.println("Statement 4 is False");
        }
    }
}
