package week06_review;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "XXXYYYZZQQQQQQWWUUUUUUUOOOOOOOO";

        String result = ""; // "XYZ"


        for (int i = 0; i < str.length(); i++) {

            if(result.contains( ""+str.charAt(i) ) ){
                continue;
            }

            result += str.charAt(i);

        }


        System.out.println("result = " + result);



    }

}
