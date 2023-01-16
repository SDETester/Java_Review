package week03_review;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class ScannerPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //n\
        int num = input.nextInt();  //12

        System.out.println("You have entered " + num);

        System.out.println("Enter a decimal number: ");

        double num2 = input.nextDouble();

        System.out.println("You have entered " + num2);

        System.out.println("Are you employed?");
        String employed = input.next();
        System.out.println("employed = " + employed);
        input.close();

    }

}



        /*Kullanıcıdan string değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Lütfen mesaj giriniz: ");
        String mesaj = input.nextLine(); //String değeri burda alıyoruz
        System.out.println("Mesajınız: "+mesaj*/
