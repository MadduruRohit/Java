package com.operators;

public class fifth {
    public static void main(String args[]) {
        int a = 10, b = 20;

        //Logical AND - && (It gives result only if both the conditions match)

        if(a == 10 && b == 20){
            System.out.println("Statement 1 is True");
        }
        else {
            System.out.println("Statement 1 is False");
        }

        //Logical OR - || (It gives result only if either of the conditions matches)

        if(a != 10 || b == 20){
            System.out.println("Statement 2 is True");
        }
        else{
            System.out.println("Statement 2 is False");
        }

        //Logical NOT - || (It gives reversed result ie if the condition is true it gives false and vice versa)

       if(!(a > b)){
           System.out.println("Statement 3 is True");
        }
       else {
           System.out.println("Statement 3 is False");
       }
    }
}
