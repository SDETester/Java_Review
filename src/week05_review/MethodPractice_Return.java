package week05_review;

public class MethodPractice_Return {

    public static void main(String[] args) {

        double a = calculate(10, '+', 30);

        System.out.println(a);


        System.out.println("---------------------------------------------");

        double multiplication = calculate(10,  '*', 20);

        System.out.println(multiplication);


        System.out.println( calculate(10,  '#', 20 ) );


        System.out.println("Hello World");

        System.out.println("------------------------------------------------------");

        System.out.println("Java".charAt(10000) );



    }

    public static double calculate(double num1, char mathOperator, double num2){
        double result = 0;

        switch (mathOperator){
            case '-':
                // return num1 - num2;
                result = num1 - num2;
                break;

            case '+':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 != 0 ) {
                    result = num1 / num2;
                }
                break;

                /*
            default:
                System.err.println("Invalid Operator");
                System.exit(1);  // terminates the whole program. EVERYTHING will stop
                 */

        }

        return result;
    }


}

/*
Tasks
    1. Create a method named calculate that accepts three arguments:
            1. num1 (double)
            2. operator (char)
            3. num2 (double)
        if the operator is +:
                the method should return the addition of the two numbers
        if the operator is -:
                the method should return the subtraction of the two numbers
        if the operator is *:
                the method should return the multiplication of the two numbers
        If the operator is /:
                if denominator is NOT zero:
                    then the method should return the division
        for any other operators, the method should return 0
 */