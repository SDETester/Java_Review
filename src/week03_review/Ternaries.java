package week03_review;

public class Ternaries {

    public static void main(String[] args) {
        int day = -200;

        String result = "";

        if (day >= 1 && day <= 7) { // 7 possible out puts
            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
                    : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday" : "Sunday";
        } else {
            result = (day < 1) ? "Minimum day number can not be less than 1"
                    : "Maximum day number can not be greater than 7";
        }

        /*if (day >= 1 && day <= 7) { // 7 possible out puts

            result = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
                    :(day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday":"Sunday";
            {day>1)? "Minimum day number can not be less than 1"
        }else{
                :"Maximum day number can not be greater than 7";

         */

        System.out.println(result);
    }
}

        /*
        if (day >= 1 && day <= 7) { // 7 possible out puts
            result = (day == 1)? "Monday" :(day == 2)? "Tuesday" :(day == 3)? "Wednesday"
                    :(day == 4)? "Thursday":(day == 5)?"Friday":(day == 6)?"Saturday":"Sunday";
        }else{
            result = (day<1)?"Minimum day number can not be less than 1"
                    :"Maximum day number can not be greater than 7";
        }

*/

