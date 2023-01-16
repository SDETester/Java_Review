package week02_review;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // byte < short < int < long < float < double

        // implicit: smaller to larger

        byte a = 50;

        long b = a ;

        double c = 100;

        // explicit: larger to smaller

        double x = 10.5;

        int y = (int) x;

        long z = 1000;

        short q = (short) z;



    }

}
