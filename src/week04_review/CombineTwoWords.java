package week04_review;

import java.util.Scanner;

public class CombineTwoWords {

        public static void main(String[] args) {

            Scanner input =  new Scanner(System.in);

            String one = input.next();
            String night = input.next();

            String result = one + night;

            if( one.charAt(one.length()-1) ==  night.charAt(0)){ // if last character of first string is equal to the first character of second string
                result =  one + night.substring(1) ;
            }

            System.out.println(result);


        }

    }

/*
Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.
                Input:
                    one
                    eight
                Output:
                    oneight
 */
