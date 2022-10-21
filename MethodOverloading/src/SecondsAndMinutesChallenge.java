public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";



    /*
    1 hr = 3600 seconds / 60 mins

     */

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        } else {
            System.out.println("Input Requested is: " + minutes + " minutes" + " and " + seconds + " seconds to be converted to hours.");
            long minutesToSeconds = (minutes * 60L) + seconds;
            //  System.out.println("This is converting Minutes to seconds: " + minutesToSeconds);
            long secondsToMins = minutesToSeconds / 60L;
            //  System.out.println("This is RE- converting seconds to minutes: " + secondsToMins);
            long minsToHours = secondsToMins / 60L;
            //  System.out.println("This is converting those minutes to hours: " + minsToHours);
            long minsRemainders = secondsToMins % 60;
            //  System.out.println("getting those remaining minutes from the conversion of mins to hours " + minsToHours);
            long remainderSeconds = minutesToSeconds % 60L;
            //   System.out.println("This is getting those remaining seconds from the conversion of mins to hours: " + remainderSeconds);

            String s = minsToHours + "hr " + minsRemainders + "min " + remainderSeconds + "s ";
            System.out.println(s);
            return s;
        }

    }

    public static String getDurationString(int seconds) {


        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;


        } else {
            long minutes = seconds / 60;
            seconds = seconds % 60;
           // System.out.println(minutes + "mins and seconds ->" + seconds);
            return getDurationString((int) minutes, seconds);
        }


        //
//        if (inches >= 0) {
//
//            double feetToInches = (int) inches / 12;
//            double feetToInchesRemainder = inches % 12;
//
//            System.out.println("This is how many feet are in " + inches + "in :" + feetToInches + "ft and " + feetToInchesRemainder + "in.");
//
//            return calcFeetAndInchesToCentimeters(feetToInches, feetToInchesRemainder);
//        }
//        System.out.println("Your Inches are Below 0!!!!");
//        return -1;

    }

}
