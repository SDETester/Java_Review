package week06_review;
import java.util.Scanner;

public class EnterEvenNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an even number:");
        int num = input.nextInt();

        /*
       while(num % 2 != 0 ){
           System.out.println(num +" is not an even number, please re-enter:");
           num = input.nextInt(); // 10
       }
*/

        /*
        do{
            if(num % 2 == 0){
                break;
            }
            System.out.println(num +" is not an even number, please re-enter:");
            num = input.nextInt(); // 10
        }while(num % 2 != 0 );
*/


        System.out.println("Even number: " + num);


    }

}

/*
Write a program that asks user to enter even number UNTIl user enters a valid input
 */

