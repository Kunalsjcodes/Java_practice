package com.unschool.java;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
import java.util.Locale;

public class StringManipulationFunction {

    public static void main(String args[]){

        String txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.length());

        String txt1 = "Please wait here!";
        System.out.println(txt1.indexOf("wait"));

        String s = "Let's Code";
        char result = s.charAt(8);
        System.out.println(result);

        String s1 ="";
        String s2 ="Hello";
        System.out.println(s1.isEmpty());   //true
        System.out.println(s2.isEmpty());   //false

        String firstName = "Kunal";
        String lastName = "Sharma";
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + " " + lastName);

        String s3 = "   Hello   ";
        System.out.println(s3+"How are you");           //without trim()
        System.out.println(s3.trim()+"How are you");    //with trim()

        String s4 = "hey";
        String s5 = "Hey";
        String s6 = "hi";
        System.out.println(s4.equalsIgnoreCase(s5));    //returns true
        System.out.println(s4.equalsIgnoreCase(s6));    //returns false

        String s7 = "Welcome to Intellij Idea";
        String replaceString=s7.replace( "Intellij Idea", "IDE");
        System.out.println(replaceString);

        String s8 = "hello how are you";
        String replaceString1=s8.replace('h', 't');
        System.out.println(replaceString1);

    }
}
