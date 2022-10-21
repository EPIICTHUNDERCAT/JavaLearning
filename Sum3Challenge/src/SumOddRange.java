public class SumOddRange {

    public static boolean isOdd(int number) {
        if (number <= 0){
            return false;
        }

        return number % 2 != 0;
    }


    public static int sumOdd(int start, int end) {

        if ((end < start) || (start < 0) || (end < 0)) {

            System.out.println("Start or End was set to 0 or below 0");
            return -1;
        }
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {

                sum += i;

                System.out.println("this is the i " + i);
            }

        }
        System.out.println(sum);
        return sum;
    }


}
