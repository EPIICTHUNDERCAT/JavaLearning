public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 500;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);

            System.out.println("Your Final Score was " + finalScore);
        }
        if (gameOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            int finalScoreTwo = score + (levelCompleted * bonus);
            System.out.println("Your New Final Score is " + finalScoreTwo);
        }

    }
}