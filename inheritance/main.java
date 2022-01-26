package com.inheritance;

public class main {

    public static void main(String args[]) {
       // Creating Objects for each class
        A a = new A();
        B b = new B();
        C c = new C();

       // Calling objects from Class A
        a.A_method_1();
        a.A_method_2();
        a.override();

        // Calling objects from Class B
        b.B_method_1();
        b.B_method_2();
        b.override();

        // Calling objects from Class C
        c.C_method_1();
        c.C_method_2();
        c.override();

        // Calling objects from Class B using Super
        A aa = new B();
        aa.override();

        // Calling objects from Class C using Suoer
        A aaa = new C();
        aaa.override();

    }
}
