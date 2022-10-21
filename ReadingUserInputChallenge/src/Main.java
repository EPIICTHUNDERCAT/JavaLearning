import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readInputs();
    }


    public static void readInputs() {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Emter number");

        // number++;
        boolean hasNextInt = scanner.hasNextInt(); // checks if number qualifies as int, if it doesn't it will return false instead of an error.

        if (hasNextInt) {


            int num = scanner.nextInt(); // next int is something that scanner class has to convert string into int! no need to use Integer.parseInt

            scanner.nextLine();//Next line is needed to enter  more than one input after the other!


        } else {
            System.out.println("Invalid Number");
        }

        scanner.close();


    }
}