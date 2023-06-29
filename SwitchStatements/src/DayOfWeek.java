public class DayOfWeek {


    public static void printWeekDay(int day) {


        if (day == 0) {
            System.out.println(day + " is Sunday");
        } else if (day == 1) {
            System.out.println(day + " is Monday");
        } else if (day == 2) {
            System.out.println(day + " is Tuesday");
        } else if (day == 3) {
            System.out.println(day + " is Wednesday");
        } else if (day == 4) {
            System.out.println(day + " is Thursday");
        } else if (day == 5) {
            System.out.println(day + " is Friday");
        } else if (day == 6) {
            System.out.println(day + " is Saturday");
        } else {
            System.out.println(day + " Does not exist within the provided range!");
        }
    }


    public static void printDayOfTheWeek(int day) {


        switch (day) {

            case 1 -> {
                System.out.println(day + " is Monday");
            }
            case 2 -> {
                System.out.println(day + " is Tuesday");
            }
            case 3 ->
                System.out.println(day + " is Wednesday");

            case 4 -> {
                System.out.println(day + " is Thursday");
            }
            case 5 -> {
                System.out.println(day + " is Friday");
            }
            case 6 -> {
                System.out.println(day + " is Saturday");
            }
            case 0 -> {
                System.out.println(day + " is Sunday");
            }
            default -> {
                System.out.println(day + " Does not exist within the provided range!");
            }


        }


    }


    public static void printDayOfTheWeekOLD(int day) {


        switch (day) {

            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default: {
                System.out.println("Invalid Day");
            }


        }


    }

    public static String getQuarter(String month) {


        switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                return "1st";
            }
            case "APRIL", "MAY", "JUNE" -> {
                return "2nd";
            }
            case "JULY", "AUGUST", "SEPTEMBER" -> {
                return "3rd";
            }
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> {
                return "4th";

            }


        }

        return "bad";

    }


    public static String getChar(Character char1) {

        switch (char1) {
            case 'A':
                return "Able";
            case 'B':
                return "Baker";
            case 'C':
                return "Charlie";
            case 'D':
                return "Dog";
            case 'E':
                return "Easy";
            default:
                return "Out of Order";
        }
    }


}
