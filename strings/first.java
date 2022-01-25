package com.strings;


public class first {

    public static void main(String args[]) {
        // Using String object
        String str = "Jala Technologies";
        // Using new Keyword
        String st = new String("Welcomes");
        // Using StringBuffer
        StringBuffer stb = new StringBuffer("You");
        // Using Character Array
        char ch[]  = new char[]{'R','o','h','i','t'};
        String s = new String(ch);
        System.out.println(str);
        System.out.println(st);
        System.out.println(stb);
        System.out.println(ch);

    }
}
