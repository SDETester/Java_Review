package week05_review;

public class MethodPractice_Void {

    public static void main(String[] args) {
        calculate(10.5, '+', 5.5);
        calculate(20, '/', 0);
        calculate(10, '/', 2);
        calculate(30, '#', 40);
        System.out.println("---------------------------------------------");
        calculate(100, '+', 200);
        calculate(-10, '+' , 20);

    }

    /*public static void calculate(double num1, char mathOperator, double num2) {

        switch (mathOperator) {

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println(num1 + "can not be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid Math Operator");

        }

    }
}
*/
    public static void calculate(double num1, char mathOperator, double num2) {
        if(num1 < 0 || num2 < 0){ //if there is negative number
            System.out.println("Both" +num1 +" and "+num2+"are not positive");
            return; //exit the method

        }
        switch (mathOperator) {

            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;

            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println(num1 + "can not be divided by zero");
                }
                break;

            default:
                System.out.println("Invalid Math Operator");

        }

    }
}





