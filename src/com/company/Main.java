package com.company;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Main {

    private static Integer numOne;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("please list a number!");
        String numbaOne = scanner.nextLine();
        double operand1 = Double.parseDouble(numbaOne);

        System.out.println("please list a second number!");
        String numbaTwo = scanner.nextLine();
        double operand2 = Double.parseDouble(numbaTwo);

        double sum = operand1 + operand2;

        double difference = operand1 - operand2;

        double division = operand1 / operand2;

        double multiplication = operand1 * operand2;

        double remainder = operand1 % operand2;


        showResults(sum, difference, division, multiplication, remainder);


    }

    public static void showResults (double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("this is the sum of your numbers, " + sum);
        System.out.println("the difference in your numbers, " + difference);
        System.out.println("the division of these two numbers, " + division);
        System.out.println("the multiplication of these two numbers are, " + multiplication);
        System.out.println("the remainder of these two numbers are " + remainder);

    }
}
