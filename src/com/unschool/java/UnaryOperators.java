package com.unschool.java;

public class UnaryOperators {

    public static void main(String args[]){

        int result = 9%2; //+ - * / %
        System.out.println("Output is: " +result);

        int output = 3 + 1 - 6 * 4 % 6 / 2;

        int x = 0;
        int y = x++; //x = 1; y = 0
        //System.out.println("Value of x and y =" +x +y);

        int p = 0;
        int q = ++p; //p = 1; q = 1
        /*
        The difference is that the post increment operator i++ returns i as it was before incrementing,
        and the pre-increment operator ++i returns i as it is after incrementing.
        System.out.println("Value of p and q =" +p +q);
        */

        // System.out.println(-a); //(minus of total positive value which starts from 0)
        // System.out.println(!val); //false (opposite of boolean value)

    }
}
