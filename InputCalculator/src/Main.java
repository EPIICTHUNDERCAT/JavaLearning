import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long average = 0;
        int count = 1;
        int number = 0;
        while (true) {
            System.out.println("Enter a number to get the sum and average! Enter a letter to exit.");


            try {
                number = Integer.parseInt(scanner.nextLine());
                sum += number;
                average = (long) Math.round(sum / count);
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("You Entered a letter!");
                break;
            }

        }
        System.out.println("Sum = " + sum + " AVG = " + average);
    }

}