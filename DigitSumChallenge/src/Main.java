public class Main {
    public static void main(String[] args) {
//        sumDigits(125);
//        sumDigits(345);
//        sumDigits(989);
//        sumDigits(123);
//        sumDigits(5);
        sumDigitsWhile(125);
        sumDigitsWhile(345);
        sumDigitsWhile(-99999);
        sumDigitsWhile(123);
        sumDigitsWhile(1);
    }

    public static int sumDigits(int num) {


        if (num >= 10) {

            int numExtract1 = num % 10; // LSD
            int lSDRemoved = num / 10; //GETTING RID DO NOT USE
            int numExtract3 = lSDRemoved / 10;
            int numExtract4 = lSDRemoved % 10;
            int sum = numExtract1 + numExtract3 + numExtract4;

            System.out.println(sum);

            return sum;
        }
        System.out.println("Number is less than 10, its: " + num);
        return -1;
    }

    public static int sumDigitsWhile(int num) {

        if (num < 10) {
            System.out.println("Bad Input");
            return -1;
        }
        int sum = 0;

        while (num > 0) {
            // System.out.println("The Init Num and Repeated:" + num);
            int digit = num % 10; // LSD
            //  System.out.println("the digit values: " + digit);
            sum += digit;
            //  System.out.println("in the Sum value: " + sum);
            num /= 10; //GETTING RID DO NOT USE
            //  System.out.println("The Final Num Val: " + num);

            //  int numExtract3 = lSDRemoved / 10; // Extract
            //   int numExtract4 = lSDRemoved % 10;
            //  sum = numExtract1 + numExtract3 + numExtract4;


        }
        System.out.println(sum);
        return sum;
    }
}