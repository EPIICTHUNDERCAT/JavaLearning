public class Main {
    public static void main(String[] args) {
        NumberOfDaysInMonth.getDaysInMonth(2, 1999);
        NumberOfDaysInMonth.getDaysInMonth(2, 2020);
        NumberOfDaysInMonth.getDaysInMonth(1, 2020);

        NumberOfDaysInMonth.getDaysInMonth(4, 2002);
        NumberOfDaysInMonth.getDaysInMonth(2, 2018);
        NumberOfDaysInMonth.getDaysInMonth(-4, 2002);
        NumberOfDaysInMonth.getDaysInMonth(22, 2018);

        NumberOfDaysInMonth.getDaysInMonth(4, 99999);
        NumberOfDaysInMonth.getDaysInMonth(2, -2018);


        for (int i = 8; i > 1; i--) {

            System.out.println(String.format("%.2f", CalculateInterest.calculateInterest
                    (10_000, i)));
        }

        System.out.println("*************************************");

        int incrementCount = 0;
        for (int i = 3; i <= 35; i++) {

            if (isPrime(i)) {
                incrementCount++;
                System.out.println("this is a prime number: " + i + " and its prime number, number: " + incrementCount);

            } else if (incrementCount == 8) {
                break;
            }


        }


    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void printNumberInWord(int a) {

        switch (a) {

            case 0:
                System.out.println("ZERO");

                break;


            case 1:
                System.out.println("ONE");

                break;


            case 2:
                System.out.println("TWO");

                break;


            case 3:
                System.out.println("THREE");

                break;


            case 4:
                System.out.println("FOUR");

                break;


            case 5:
                System.out.println("FIVE");

                break;


            case 6:
                System.out.println("SIX");

                break;


            case 7:
                System.out.println("SEVEN");

                break;


            case 8:
                System.out.println("EIGHT");

                break;


            case 9:
                System.out.println("NINE");

                break;

            default:
                System.out.println("Other");
                break;

        }

    }
}