package week03_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Enter two numbers:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();


        System.out.println("Enter a math operator:");

        char operator = input.next().charAt(0);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("Invalid Operator" + operator);


    }
    }
