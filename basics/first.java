package com.basics;

public class first {
    static class Student{
        String name;
        int age;
    }
    public static  void main(String args[]){
        Student s1 = new Student();
        s1.name = "Jala Technologies";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
