import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


















        int numberCounter = 0;
        int number0 = 0;
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        int numberTotal = 0;
        do {

            Scanner scanner = new Scanner(System.in);
            try {


                if (numberCounter == 0) {
                    System.out.println("Enter First Number: ");
                    number0 = Integer.parseInt(scanner.nextLine());
                    //    System.out.println("Current Number Input:" + number0);
                    //  System.out.println("Number 0: " + number0);
                } else if (numberCounter == 1) {
                    System.out.println("Enter Second Number: ");
                    number1 = Integer.parseInt(scanner.nextLine());
                    //   System.out.println("Current Number Input:" + number1);

                    //   System.out.println("Number 1: " + number1);
                } else if (numberCounter == 2) {
                    System.out.println("Enter Third Number: ");
                    number2 = Integer.parseInt(scanner.nextLine());
                    //  System.out.println("Current Number Input:" + number2);

                    //  System.out.println("Number 2: " + number2);
                } else if (numberCounter == 3) {
                    System.out.println("Enter Fourth Number: ");
                    number3 = Integer.parseInt(scanner.nextLine());
                    //   System.out.println("Current Number Input:" + number3);

                    //  System.out.println("Number 3: " + number3);
                } else if (numberCounter == 4) {
                    System.out.println("Enter Fifth Number: ");
                    number4 = Integer.parseInt(scanner.nextLine());
                    // System.out.println("Current Number Input:" + number4);

                    //   System.out.println("Number 4: " + number4);


                }
                // System.out.println("This is the number 0 outside: " + number0);
                numberTotal = number0 + number1 + number2 + number3 + number4;
                System.out.println("Your Number Total: " + numberTotal);
//                numberTotal = number1 + number2 + number3 + number4 + number0;
//                System.out.println("Your Total in Numbers is: " + numberTotal);
                numberCounter++;
                //  System.out.println("Number Counter: " + numberCounter);

            } catch (NumberFormatException exception) {
                System.out.println("Invalid Number! Enter a number ONLY.");
            }


        } while (numberCounter <= 4);


    }

    public static int userInputNumber(int num) {

        return num;
    }


}