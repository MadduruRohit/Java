package com.operators;

public class third_fourth {

    static void equal(int a, int b) {
        if (a == b) {
            System.out.println("Values are Equal");
        }
    }

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
