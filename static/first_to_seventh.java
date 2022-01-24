package com.static_files;

public class first_to_seventh {

    // 2 Static Variables

    static int var1 = 15;
    static int var2 = 30;

    // 2 Instance Variables

    int ins1 = 40;
    int ins2 = 80;

    // 2 Static Methods

    static void add() {
        int a, b, sum = 0;
        first_to_seventh f = new first_to_seventh();
        a = f.ins1;
        b = f.ins2;
        sum = a + b;
        System.out.println("The sum of Instance variables are :" + sum);
    }

    static void multiply() {
        int a, b, sum = 0;
        first_to_seventh f = new first_to_seventh();
        a = f.ins1;
        b = f.ins2;
        sum = a * b;
        System.out.println("The product of static variables are :" + sum);

    }

    // 2 Instance Methods

    void instance1() {
        System.out.println("The static variable var1 is : " + var1);
    }

    void instance2() {
        System.out.println("The instance variable ins2 is : " + ins2);
    }

    public static void main(String args[]) {
        // calling instance variables in static method
        add();
        // calling static variables in static method
        multiply();
        //creating Object for calling Instance Methods
        first_to_seventh o = new first_to_seventh();
        // calling static variables in Instance method
        o.instance1();
        // calling instance variables in Instance method
        o.instance2();

    }
}
