public class Main {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(48, 128));
        System.out.println(getGreatestCommonDivisor(25, 15));

        System.out.println(getGreatestCommonDivisor(12, 30)); //should return 6 since both can be divided by 6 without a remainder

        System.out.println(getGreatestCommonDivisor(9, 18)); //should return -1 since the first parameter is < 10

        System.out.println(getGreatestCommonDivisor(81, 153));
    }


    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {

            return -1;
        }
        int divisor = Math.min(first, second);


        for (int i = divisor; i > 0; i--) {

            if ((first % i == 0) && (second % i == 0)) {

                divisor = i;
                break;
            }


        }

        //System.out.println("final conclusion: " + divisor);
        return divisor;
    }









    public static boolean codingProductivity(boolean isHigh) {

        if (isHigh) {

            return false;

        }
        return true;

    }
}