package com.unschool.java;

public class TernaryOperator {

    public static void main(String args[]){

        int februaryDays = 29;
        String Op;

        Op = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(Op);
    }
}
