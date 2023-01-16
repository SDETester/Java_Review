package week04_review;

import java.util.Scanner;

public class TestStringObjects {

    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);

        String str1 = new String("Java"); // Heap

        String str2 = "Java"; // String pool

        // Scanner input = System.in;


        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);


        System.out.println(str1 == str2 );

        System.out.println(str1.equals(str2));

        System.out.println("----------------------------------------");
        String s1 = "Batch 28";

        String s2 = "Batch 28";

        System.out.println(s1 == s2);

        String s3 = new Scanner(System.in).nextLine(); //new String("Batch 28")

        System.out.println(s2 == s3); // false
        System.out.println(s2.equals(s3));

        System.out.println("----------------------------------------");

        String a1 =  "Wooden Spoon";
        String a2 =  "Wooden Spoon";
        String a3 =  "Wooden Spoon";
        String a4 =  "Wooden Spoon";
        String a5 =  "Wooden Spoon";


        String b1 = new String("Wooden Spoon");
        String b2 = new String("Wooden Spoon");
        String b3 = new String("Wooden Spoon");
        String b4 = new String("Wooden Spoon");
        String b5 = new String("Wooden Spoon");



    }

}

