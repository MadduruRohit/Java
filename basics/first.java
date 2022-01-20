package com.basics;

public class first {
    //Here we are creating an Class Named Student, so A Class is a blueprint that describes the details of an object
    static class Student{
        String name;
        int age;
    }
    public static  void main(String args[]){
        //Here we are creating an Object, so A Object is Nothing But it is an Instance of an class
        Student s1 = new Student();
        s1.name = "Jala Technologies";
        s1.age = 20;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
