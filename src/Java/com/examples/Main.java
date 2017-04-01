package com.examples;

/**
 * Created by lopam on 01/04/2017.
 */
public class Main {
    public static void main(String [] args)
    {
        StringCalculator calculator = new StringCalculator();
        int output = calculator.add(5,6);
        System.out.println("Addition of 2 numbers" +  " " + output);
    }
}
