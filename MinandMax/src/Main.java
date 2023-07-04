import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double userInputNum = 0;
        double max = 0;
        double min = 0;
//        double currentMax = 0;
//        double currentMin = 0;
        boolean firstInput = true;

        System.out.println("Enter a Number to play, enter a character to exit! ");
        do {


            try {
                String userInput = scanner.nextLine();

                userInputNum = Double.parseDouble(userInput);
                if (firstInput == true) {
                    min = userInputNum;
                    max = userInputNum;
                    firstInput = false;
                }

                if (userInputNum < min) {
                    min = userInputNum;
                }

                if (userInputNum > max) {
                    max = userInputNum;
                }


                System.out.println("Current Min: " + min + " Current Max: " + max);
            } catch (NumberFormatException nfe) {
                System.out.println("You Entered a non digit, Exiting!");
                break;
            }

        } while (true);


    }
}