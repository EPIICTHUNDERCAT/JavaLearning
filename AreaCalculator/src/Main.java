import java.awt.geom.Area;

public class Main {
//    Area Calculator
//
//
//    The method needs to return a double value that represents the area of a circle.
//
//
//
//    The method needs to return an area of a rectangle.
//
//    For formulas and PI value please check the tips below.
//
//    Examples of input/output:
//
//    area(5.0); should return 78.53975
//
//    area(-1);  should return -1 since the parameter is negative
//
//    area(5.0, 4.0); should return 20.0 (5 * 4 = 20)
//
//    area(-1.0, 4.0);  should return -1 since first the parameter is negative
//
//
//    TIP: ​The formula for calculating the area of a rectangle is x * y.
//
//            TIP: ​The formula for calculating a circle area is radius * radius * PI.
//
//            TIP: For PI use a constant from Math class e.g. Math.PI
//
//    NOTE: All methods need to be defined as public static ​like we have been doing so far in the course.
//
//    NOTE: Do not add a main method to your solution code!


    public static void main(String[] args) {
        area(40);
        double piPI = area(40);
        System.out.println(piPI);
        double triTriangle = area(5.0, -4.0);
        System.out.println(triTriangle);


        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsDaysCalculator.printYearsAndDays(-1);

        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 2, 1);
        EqualityPrinter.printEqual(2, 1, 1);
        EqualityPrinter.printEqual(1, 1, 2);
        EqualityPrinter.printEqual(2, 1, 2);
        EqualityPrinter.printEqual(-1, 1, 1);
        EqualityPrinter.printEqual(1, 1, 1);
        EqualityPrinter.printEqual(1, 2, 3);
        EqualityPrinter.printEqual(21, 21, 21);
        System.out.println("NEW CODE BELOW");


        System.out.println("Should be False since its out of the temp range " + PlayingCat.isCatPlaying(true, 90));
        System.out.println("Should be False since its out of the temp range " + PlayingCat.isCatPlaying(false, 10));
        System.out.println("Should be True since its in Temp Range and it is summer " + PlayingCat.isCatPlaying(true, 35));
        System.out.println("Should be True since its Not Summer and in Temp range " + PlayingCat.isCatPlaying(false, 35));
        System.out.println("Should be False since its out of the temp range " + PlayingCat.isCatPlaying(true, 10));
        System.out.println("Should be False since its out of the temp range " + PlayingCat.isCatPlaying(false, 45));


    }

    public static double area(double radius) {

        if (radius < 0) {
            return -1.0d;
        }

        double areaOfPi = (radius * radius) * Math.PI;


        return areaOfPi;
    }

    public static double area(double x, double y) {

        if ((x < 0) || (y < 0)) {
            return -1.0d;
        }
        double areaOfTriangle = x * y;

        return areaOfTriangle;
    }


}