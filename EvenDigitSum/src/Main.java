public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        isEven(2);
//        isEven(45);
//        isEven(3);

        getEvenDigitSum(7892864);
//        getEvenDigitSum(22222);
//        getEvenDigitSum(35656789);
//        getEvenDigitSum(3443);
//        getEvenDigitSum(824345864);
        //  sumDigitsWhile(875);
    }


    public static int getEvenDigitSum(int num) {
        int totalSum = 0;

        if (num < 0) {
            return -1;
        }

        while (num > 0) {
            int number = num % 10;

              System.out.println(number);

            if (number % 2 == 0) {

                totalSum += number;
                    System.out.println(totalSum);
                number /= 10;


                //   number %= 10;
            }
            num /= 10;
               System.out.println("this number is not even and will be ignored: " + number);


            continue;
        }

        System.out.println("this is the total sum of the even numbers:" + totalSum);
        return totalSum;

    }


    public static boolean isEven(int num) {


        if (num % 2 != 0) {

            return false;

        }
        System.out.println("Is Even: " + num);
        return true;


    }
}