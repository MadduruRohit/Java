package com.operators;

public class third_fourth {
   // == checks if both the values are equal
    static void equal(int a, int b) {
        if (a == b) {
            System.out.println("Values are Equal");
        }
    }

    // != checks if both the values are not equal
    static void notequal(int a, int b) {
        if (a != b) {
            System.out.println("Values are Not Equal");
        }
    }

    public static void main(String args[]) {
        int a = 10, b = 10;
        equal(a, b);
        notequal(a, b);

    }
}
