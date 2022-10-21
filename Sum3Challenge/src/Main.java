public class Main {
    public static void main(String[] args) {

        //System.out.println(SumOddRange.isOdd(2));
        SumOddRange.sumOdd(13, 13);
        SumOddRange.sumOdd(1, 100);
        SumOddRange.sumOdd(-1, 100);
        SumOddRange.sumOdd(100, -100);
        SumOddRange.sumOdd(100, 1000);

        System.out.println("****************************");


        int count = 0;

        int sum = 0;

        for (int i = 1; i <= 1000; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i;

                System.out.println("found number " + i);
            }
            if (count == 5) {
                break;

            }

        }
        System.out.println("sum = " + sum);

    }
}