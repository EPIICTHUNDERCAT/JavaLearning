public class Main {
    public static void main(String[] args) {


        byte myChallengeByteVariable = 50;

        short myChallengeShortVariable = 100;

        int myChallengeIntVariable = 3000;

        long myChallengeLongVariable = 50_000L + 10L *
                (myChallengeByteVariable + myChallengeIntVariable + myChallengeShortVariable);

        System.out.println(myChallengeLongVariable);

    }
}