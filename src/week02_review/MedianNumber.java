package week02_review;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 20;

        boolean aIsMedian =  ( b > a && a > c ) || (c > a && a > b);
        // in order for a to be median number between three  DIFFERENT numbers
        //  a needs to be less than b and greater than c. OR a need to be less than c and greater than b

        boolean bIsMedian =  ( a > b && b > c ) || (c > b && b > a);
        // in order for b to be median number between three  DIFFERENT numbers
        //  b needs to be less than a and greater than c. OR b needs to be less than c and greater than a


        boolean cIsMedian = !aIsMedian && !bIsMedian;
        // if both a and b are not the median number between three different numbers. then c must be the median number

        if( aIsMedian ){
            System.out.println(a +" is the median number");
        }




    }


}


/*
Create a class named MedianNumber. write a program that can find the median number between three DIFFERENT given integers
		Ex:
                a = 10, b= 15, c = 20;
            Output:
                15 is the median number
 */



