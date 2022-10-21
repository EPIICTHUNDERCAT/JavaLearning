public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println("True");
                return true;
            } else {
                System.out.println("False");
                return false;
            }

        }
        System.out.println("False - Out of Bounds");
        return false;
    }

}
