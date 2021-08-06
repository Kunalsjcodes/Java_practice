package com.unschool.java;

import java.util.Scanner;

public class Datatype2 {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter User Name:-");
            String myText = scan.nextLine();
            System.out.println("My name is "+myText);

            System.out.println("Enter Integer:-");
            int myNum = scan.nextInt();
            System.out.println("My Integer is "+myNum);

            System.out.println("Enter Floating Point Number:-");
            float myFloatNum = scan.nextFloat();
            System.out.println("My Float Value is "+myFloatNum);

            System.out.println("Enter Character:-");
            char myLetter = scan.next(). charAt(0);
            System.out.println("My Character is "+myLetter);

            scan.close();
        }
    }