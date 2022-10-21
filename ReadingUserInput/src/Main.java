import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


/// new is creating instances of XXX class
//
//        String string = "2000";
//
//        int stringToInt = Integer.parseInt(string);
//
//        System.out.println(stringToInt);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt(); // checks if number qualifies as int, if it doesn't it will return false instead of an error.
        if (hasNextInt) {


            int yearOfBirth = scanner.nextInt(); // next int is something that scanner class has to convert string into int! no need to use Integer.parseInt

            scanner.nextLine();//Next line is needed to enter  more than one input after the other!

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            int age = 2022 - yearOfBirth;
            if (age >= 0 && age <= 100) {

                System.out.println("Your Name is " + name + ", and you are " + age + " Years Old.");
            } else {
                System.out.println("IMPROPER AGE Entered: ");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close(); // This ends the instance of the scanner call, closes the memory use and loop.


    }
}