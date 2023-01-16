package week03_review;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;

public class IfStatements1 {
    public static void main(String[] args) {


        int num = 100;
        /*

        if (num % 2 != 0){
            System.out.println("Odd Number");
        }
        if ( num % 2 == 0){
            System.out.println("Even Number");
        }

         */

        if (num % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }

        System.out.println("________________________________");

        int month = 14;
        if (month >= 1 && month <= 12) {

            if (month == 2) {
                System.out.println("28 Days");
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                System.out.println("30 Days");
            } else {
                System.out.println("31 Days");
            }
        } else { // if the month is NOT valid
            if (month < 1) {
                System.out.println("minimum month number is 1");
            } else {
                System.out.println("maximum month number iss 12");
            }

            }

        }
    }