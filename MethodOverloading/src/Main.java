public class Main {
    public static void main(String[] args) {
// Overloading Methods:
        int newScore = calculateScore("Giboon", 2300);
        System.out.println("New Score is: " + newScore);
        calculateScore(3200);
        int newScore2 = calculateScore(3200);
        System.out.println("New Score is: " + newScore2);

        calculateScore();
        Challenge.calcFeetAndInchesToCentimeters(0d, 1d);
        Challenge.calcFeetAndInchesToCentimeters(18d, 12d);
        Challenge.calcFeetAndInchesToCentimeters(1d, 6d);
        Challenge.calcFeetAndInchesToCentimeters(56698d, 12d);

        Challenge.calcFeetAndInchesToCentimeters(327423.343d);

        Challenge.calcFeetAndInchesToCentimeters(-157d);
        SecondsAndMinutesChallenge.getDurationString(454325, 1);
        SecondsAndMinutesChallenge.getDurationString(120, 0);
        SecondsAndMinutesChallenge.getDurationString(600, 59);
        SecondsAndMinutesChallenge.getDurationString(0, 1);
        SecondsAndMinutesChallenge.getDurationString(874, 0);

        System.out.println("BELOW");
        SecondsAndMinutesChallenge.getDurationString(9339999);

    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " Scored " + score + " points!");

        return score * 1000;

    }


    public static int calculateScore(int score) {
        System.out.println("Unnamed Player Scored " + score + " points!");

        return score * 1000;


    }

    public static int calculateScore() {
        System.out.println("Unnamed Player Scored no points!");

        return 0;


    }


}