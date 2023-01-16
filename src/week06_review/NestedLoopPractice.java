package week06_review;

public class NestedLoopPractice {

    public static void main(String[] args) throws InterruptedException {


        for (int m = 4; m >= 0; m--) {

            for (int s = 59; s >= 0; s--) {
                System.out.println(m + " minutes " + s + " seconds");
                Thread.sleep(100);
            }

        }
    }
}






    /*
    public static void main(String[] args)
        /*

    for(
    int m = 4;
    m >=0;m--)

    {
        for (int s = 59; s > 0; s--) {
            System.out.println(m + " minute " + s + " seconds");
            Thread.sleep(100);

        }
    }
}
*/
