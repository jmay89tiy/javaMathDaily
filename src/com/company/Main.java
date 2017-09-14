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



        System.out.println(showResults("this is the sum of your numbers, " + sum));
        System.out.println(showResults("the difference in your numbers, " + difference));
        System.out.println(showResults("the division of these two numbers, " + division));
        System.out.println(showResults("the multiplication of these two numbers are, " + multiplication));
        System.out.println(showResults("the remainder of these two numbers are " + remainder));

    }

    public static String showResults (String resultFinal) {
        return resultFinal;

    }
}
