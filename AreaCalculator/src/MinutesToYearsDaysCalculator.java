public class MinutesToYearsDaysCalculator {

//    60 mins is an hour
//    24 hours are a day
//    365 days in a year


    public static final String NOT_A_VALID_INPUT = "Invalid Value";

    public static void printYearsAndDays(long minutes) {


        if (minutes < 0) {
            System.out.println(NOT_A_VALID_INPUT);

        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long remainderDays = days % 365;
            long years = days / 365;


            System.out.println(minutes + " min = " + years + " y and " + remainderDays + " d");
        }

    }


}
