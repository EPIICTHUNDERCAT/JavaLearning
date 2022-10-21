import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int result = 1 + 2;

        System.out.println(result);


        int previousResult = result;

        System.out.println(previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);


        result = result + 10;
        System.out.println("addition results = " + result);

        result = result / 2;
        System.out.println("division of 2 = " + result);

        result = result % 2;


        System.out.println("% result = " + result);

        result++;
        System.out.println("++ result = " + result);

        result--;
        System.out.println("-- result = " + result);

        result += 2;
        System.out.println("+2 Result = " + result);

        result *= 10;
        System.out.println("*10 Result = " + result);

        result /= 5;
        System.out.println("/5 Result = " + result);

        result -= 2;
        System.out.println("-2 Result = " + result);


        boolean isTwentyOne = false;

        if (isTwentyOne == true) {

            System.out.println("Allowed in");

        } else if (isTwentyOne == false) {

            System.out.println("JAIL NOW!");

        }
        int topScore = 91;

        if (topScore == 100) {

            System.out.println("You got a High Score!");

        } else if (topScore <= 100) {

            System.out.println("You SUCK!!");

        } else if (topScore >= 100) {

            System.out.println("YOU ARE AMAZING!!");

        }
        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {

            System.out.println("Complicated ");
        }

        int thirdTopScore = 60;
        if ((topScore > thirdTopScore) && (topScore < 100)) {

            System.out.println("Complicated as Hell");


        }
        int cuatroTopScore = 60;
        if ((topScore > 90) || (cuatroTopScore <= 100)) {

            System.out.println("OR Operator Valid");


        }
        int testScore = 60;
        if ((topScore > 60)) {

            System.out.println("OR Operator Valid");


        }


        boolean isDog = false;
        if (isDog == true){
            System.out.println("this is a weird integration");
        }

        if (!isDog) {
            System.out.println("False");


        }
        isDog = true;
        boolean wasDog = isDog ? true : false;
        if (wasDog){
            System.out.println("was dog is true");
        }

        boolean isGibby = true;

        boolean wasGibby = isGibby ? true : false;
        System.out.println(wasGibby);
        if (isGibby){
            System.out.println("It was Giboon");
        } else if (!isGibby) {
            System.out.println("NICHT GIBOON");

            System.out.println(wasGibby);
        }


        int ageOfGibby = 24;

        boolean isEighteenOrOver = (ageOfGibby ==24) ? true : false;

        System.out.println(isEighteenOrOver);



        double myChallengeDouble = 20.00d;
        double myChallengeDoubleTwo = 80.00d;

        double myTotalChallenge = (myChallengeDouble + myChallengeDoubleTwo) * 100.00d;

        double myRemainder = myTotalChallenge % 40.00d;

        boolean isZero = myRemainder ==0 ? true : false;

        System.out.println("The Remainder is = " + isZero);

        if (isZero){
            System.out.println("This Equals Zero");
        } else {
            System.out.println("Got Some Remainder");
        }

        /////  WRONG BELOW ////

        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;

        double myTotalValue = myFirstValue + mySecondValue * 100.00d;

        double myRemainderTwo = myTotalValue % 40.00d;

        boolean isZeroTwo = myRemainderTwo ==0 ? true : false;

        System.out.println("WRONG? The Remainder is = " + isZeroTwo);

        if (isZeroTwo){
            System.out.println("WRONG? This Equals Zero");
        } else {
            System.out.println("WRONG? Got Some Remainder");
        }






    }
}