package week03_review;

import java.util.Scanner;

public class NextLineMethod {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    System.out.println("Gürcan");
    String fullName = input.nextLine(); // Merhaba
    System.out.println("fullName = " + fullName);
    System.out.println("Enter your age");
    int age = input.nextInt();  //29
    System.out.println("Enter your scholl name");
    String schoolName = input.nextLine();
    System.out.println("schoolName = " + schoolName);
}

}