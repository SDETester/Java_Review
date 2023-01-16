package week04_review;

public class StringMethodsPractice {

        public static void main(String[] args) {

            String str = "Cydeo School";

            char ch = str.charAt(1);

            int length = str.length();


            System.out.println(ch);
            System.out.println(length);

            int lastIndex = str.length() - 1;

            char ch2 = str.charAt(lastIndex);

            System.out.println(ch2);


            int indexOfE = str.indexOf('e');

            System.out.println("indexOfE = " + indexOfE);

            int indexOfFirstO = str.indexOf("o");

            System.out.println("indexOfFirstO = " + indexOfFirstO);

            int indexOfSecondO = str.indexOf("oo");

            System.out.println("indexOfSecondO = " + indexOfSecondO);


            System.out.println("---------------------------------------------------------------");


            String s1 = "BATCH 28";

            s1 = s1.toLowerCase();// "batch 28"

            System.out.println("s1 = " + s1);

            System.out.println("---------------------------------------------------------------");

            String s2 = "I live in Virginia, I love Virginia";

            // s2 = s2.replace("Virginia", "New York");
            //s2 = s2.replaceFirst("Virginia", "New York");
            s2 = s2.replaceFirst("love Virginia", "love New York");

            System.out.println(s2);

            System.out.println("---------------------------------------------------------------");


            String s3 = "Batch 28 students";

            String t1 = s3.substring(0, 8);

            System.out.println(t1);

            String t2 = s3.substring(s3.indexOf('s'));

            System.out.println(t2);

            System.out.println("---------------------------------------------------------------");

            String name = "mUhTaR";

            name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
            //name =  ( "" + name.charAt(0) ).toUpperCase()    + name.substring(1).toLowerCase();


            System.out.println(name);

            System.out.println("---------------------------------------------------------------");

            String a = "yEs";

            System.out.println(a.equals("yes"));
            System.out.println(a.equalsIgnoreCase("yes"));

            System.out.println("---------------------------------------------------------------");

            String l = "Today we will have Java and Soft Skill classes";

            boolean hasSelenium = l.contains("Selenium");
            boolean hasJava = l.toLowerCase().contains("java");

            System.out.println("hasSelenium = " + hasSelenium);
            System.out.println("hasJava = " + hasJava);

            System.out.println("---------------------------------------------------------------");


        }


    }
