package com.arrays;

public class second {
    static void avg(int arr[]) {
        int average = 0, totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum = totalsum + arr[i];
        }
        average = (totalsum / 2);
        System.out.println(average + " is the average of the array");
    }

    public static void main(String args[]) {
        int arr[] = {3, 8, 6, 7, 9, 3, 12, 66, 9, 5};
        avg(arr);
    }
}
