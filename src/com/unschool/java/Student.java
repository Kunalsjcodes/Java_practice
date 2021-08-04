//Java program to illustrate how to define a class and fields
package com.unschool.java;
//Defining a Student class.
public class Student {

    //defining fields
    int id=10;//fields or data number or instance variable
    String name="Kunal";
    //creating main method inside the student class
    public static void main(String args[]){
        //Creating an object or instance
        Student s1=new Student(); //Creating an object of class
        //Printing values of the object
        System.out.println(s1.id); //accessing member through reference variable
        System.out.println(s1.name);
    }
}
