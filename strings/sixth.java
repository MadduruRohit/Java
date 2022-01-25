package com.strings;

public class sixth {
    public static void main(String args[]) {

        // (,*) is used to check before and after the string
        String str = "Rohit Madduru";
        System.out.println(str.matches("Rohit Madduru"));
        System.out.println(str.matches("Rohit"));
        System.out.println(str.matches("(.*)Rohit(.*)"));
        System.out.println(str.matches("Rohit(.*)"));
        System.out.println(str.matches("(.*)Rohit"));
        System.out.println(str.matches("u"));
        System.out.println(str.matches("(.*)u(.*)"));
        System.out.println(str.matches("u(.*)"));
        System.out.println(str.matches("(.*)u"));
        System.out.println(str.matches("M"));
        System.out.println(str.matches("(.*)M(.*)"));
        System.out.println(str.matches("M(.*)"));
        System.out.println(str.matches("(.*)M"));
    }
}
