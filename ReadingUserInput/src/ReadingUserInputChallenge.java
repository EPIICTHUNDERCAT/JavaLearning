import java.util.Scanner;

public class ReadingUserInputChallenge {


    public static void readInputs() {

        Scanner scanner = new Scanner(System.in);


        boolean hasNextInt = scanner.hasNextInt(); // checks if number qualifies as int, if it doesn't it will return false instead of an error.
        if (hasNextInt) {


            System.out.println("Emter number");
            int number = scanner.nextInt(); // next int is something that scanner class has to convert string into int! no need to use Integer.parseInt

            scanner.nextLine();//Next line is needed to enter  more than one input after the other!


        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();


    }
}
