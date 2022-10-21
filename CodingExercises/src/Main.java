public class Main {
    public static void main(String[] args) {
        System.out.println("test");
        checkNumber(-100);
        checkNumber(100);
        checkNumber(0);
        SpeedConverterExercise.printConversion(130.83d);
        SpeedConverterExercise.printConversion(-44.9d);
        double miles = SpeedConverterExercise.toMilesPerHour(-95.00d);
        System.out.println(miles);

        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
        System.out.println("Below is 1 hour with barking dog: Should be True");
        BarkingDog.shouldWakeUp(true, 1);
        System.out.println("Below is 2 hour with no barking dog: Should be False");
        BarkingDog.shouldWakeUp(false, 2);
        System.out.println("Below is 8 hour with barking dog: Should be False");
        BarkingDog.shouldWakeUp(true, 8);
        System.out.println("Below is -133 hour with barking dog: Should be False Since Hours doesnt exist");
        BarkingDog.shouldWakeUp(true, -133);
        System.out.println("Below is -153 hour with no barking dog: Should be False Since Hours doesnt exist");
        BarkingDog.shouldWakeUp(false, -153);
        System.out.println("Below is 0 hour with barking dog: Should be True");
        BarkingDog.shouldWakeUp(true, 0);
        System.out.println("Below is 23 hour with no barking dog: Should be False");
        BarkingDog.shouldWakeUp(false, 23);

        System.out.println("Leap Year CODE");
        LeapYear.isLeapYear(-100);
        System.out.println("Leap Year CODE1");
        LeapYear.isLeapYear(2022);
        System.out.println("Leap Year CODE2");
        LeapYear.isLeapYear(2400);
        System.out.println("Leap Year CODE3");
        LeapYear.isLeapYear(30323);

        System.out.println("Decimal Checker: " + DecimalComparators.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("Decimal Checker: " + DecimalComparators.areEqualByThreeDecimalPlaces(-10.434d, -10.434d));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(12, 15, 27));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(1, -1, 0));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(1, 1, 665));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(565, 1, 6));
        System.out.println("Equal Summation: " + EqualSumChecker.hasEqualSum(677, 1, 1));
        System.out.println("Has Teen: " + TeenNumberChecker.hasTeen(25, 13, 90));
        System.out.println("Has Teen: " + TeenNumberChecker.hasTeen(25, 63, 90));
        System.out.println("Has Teen: " + TeenNumberChecker.hasTeen(13, 18, 19));
        System.out.println("Has Teen: " + TeenNumberChecker.hasTeen(13, 40, 19));
        System.out.println("Is Teen: " + TeenNumberChecker.isTeen(40));
        System.out.println("Is Teen: " + TeenNumberChecker.isTeen(13));


        EqualSumChecker.hasEqualSum(1, 1, 1);


    }

    public static void checkNumber(int number) {

        if (number > 0) {

            System.out.println("positive");

        } else if (number < 0) {

            System.out.println("negative");

        } else {

            System.out.println("zero");

        }
    }
}