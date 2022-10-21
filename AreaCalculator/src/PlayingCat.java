public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temp) {

        if ((!summer) && (temp >= 25) && (temp <= 35)) {

            System.out.println("It is not summer and the temp is between 25 - 35");

            return true;


        } else if ((summer) && (temp >= 25) && (temp <= 45)) {
            System.out.println("it is summer and temp is between 25-45");

            return true;


        }
        if (temp < 25 || temp > 45) {

            return false;
        }
        return false;
    }


}
