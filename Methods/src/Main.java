import javax.swing.text.Position;

public class Main {


    public static void main(String[] args) {


        displayHighScorePosition("David", calculateHighScorePosition(1000));

        displayHighScorePosition("Josh", calculateHighScorePosition(1000));

        displayHighScorePosition("Caleb", calculateHighScorePosition(400));

        displayHighScorePosition("Justin", calculateHighScorePosition(500));


//        int highScore = calculateScore();
//        calculateScore(true, 800, 5, 100);
//        calculateScore(true, 10_000, 8, 200);
//
    }


    public static void displayHighScorePosition(String playername, int position) {

        System.out.println(playername + " managed to get position " + position + " on the High Score table.");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
    }


//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your Final Score was " + finalScore);
//            return finalScore;
//        }
//        return -1;
//
//    }

}