package com.inheritance;

public class B extends  A {

        void B_method_1()
        {
            System.out.println("class B - method 1");
        }
        void B_method_2()
        {
            System.out.println("class B - method 2");
            super.override();
        }
        public void override()
        {
            System.out.println("class B - override");
        }



}
