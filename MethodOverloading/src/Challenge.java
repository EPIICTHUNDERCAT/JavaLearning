public class Challenge {


    /*
    1 Inch is 2.54cm
    1 foot is 12 inches

     */


    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {


        if ((feet >= 0) && (inches >= 0 && inches <= 12)) {

            double feetConversion = feet * 30.48d;
            double inchConversion = inches * 2.54d;
            double totalCM = feetConversion + inchConversion;
            System.out.println("Your Total Centimeters are after converting " + feet + "ft and " + inches + "in is: " + totalCM + "cm");
            return totalCM;
        } else

            System.out.println("Numbers Entered are not within 12 inches or below 0");
        return -1;

    }


    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches >= 0) {

            double feetToInches = (int) inches / 12;
            double feetToInchesRemainder = inches % 12;

            System.out.println("This is how many feet are in " + inches + "in :" + feetToInches + "ft and " + feetToInchesRemainder + "in.");

            return calcFeetAndInchesToCentimeters(feetToInches, feetToInchesRemainder);
        }
        System.out.println("Your Inches are Below 0!!!!");
        return -1;

    }


}
