package week05_review;

public class ForLoopPractice2 {

        public static void main(String[] args) {

            System.out.println( reverse("Cydeo") );


        }

        //"Cydeo"
        public static String reverse(String str){
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }

            return  result;
        }


    }
