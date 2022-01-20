package com.basics;

public class fifth {
    //Global Variable are accessible globally in entire program
     static int l = 10;
      float f = 20.5f;

    public static void main(String args[]){
        //Local Variables are only accessible inside the method or block where they are defined
        int l = 30;
        float f = 87.45f;

        // Case - 1 : The output will be 30 30 because in java we should never write variables with same name;
        System.out.println("local l is : " + l);
        System.out.println("global l is : " + l);
        System.out.println("local l is : " + f);
        System.out.println("global l is : " + f);
    }
}
