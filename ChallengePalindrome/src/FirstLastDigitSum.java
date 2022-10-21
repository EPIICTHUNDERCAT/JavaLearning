import java.io.Console;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {


        if (number < 0) {
            return -1;

        }


        int num = number;
        int lastDigit = num % 10;

        while (num > 9) {

            System.out.println("inserted number:" + num);
            num /= 10;
            System.out.println("Num Check Input: " + num);
            System.out.println(lastDigit);
            continue;
        }
        System.out.println(lastDigit + num);
        return lastDigit + num;

    }


}
