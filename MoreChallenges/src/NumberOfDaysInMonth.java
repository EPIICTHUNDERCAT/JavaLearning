public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                //System.out.println("True");
                return true;
            } else {
                //   System.out.println("False");
                return false;
            }

        }
        System.out.println("False - Out of Bounds");
        return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (month < 1 || month > 12) {
            System.out.println("Invalid Entry: Month Value not between 1-12");
            return -1;
        } else if (year < 1 || year > 9999) {
            System.out.println("Invalid Entry: year value not between 1-9999");
            return -1;
        }

        switch (month) {
            case 1:

                return 31;


            case 2:
                if (!isLeapYear(year)) {

                    System.out.println("February has 28 Days in a leap year");
                    return 28;
                } else if (isLeapYear(year)) {
                    System.out.println("This is a Leap Year, February has 29 Days");
                    return 29;
                }
                break;

            case 3:

                System.out.println("March has 31 Days This year");

                return 31;

            case 4:
                System.out.println("April has 30 Days This year");

                return 30;


            case 5:
                System.out.println("May has 31 Days This year");

                return 31;
            case 6:
                System.out.println("June has 30 Days This year");

                return 30;
            case 7:
                System.out.println("July has 31 Days This year");
                return 31;

            case 8:
                System.out.println("August has 31 Days This year");

                return 31;

            case 9:
                System.out.println("September has 30 Days This year");

                return 30;
            case 10:
                System.out.println("October has 31 Days This year");

                return 31;

            case 11:
                System.out.println("November has 30 Days This year");

                return 30;

            case 12:
                System.out.println("December has 31 Days This year");

                return 31;
            default:
                System.out.println("Invalid Entry");
                break;
        }


        return -1;
    }


}
