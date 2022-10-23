import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // readInputs();
        minAndMax();
    }


    public static void readInputs() {
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);


        while (true) {
            int order = counter + 1;
            System.out.println("Enter #: " + order + ":");
            boolean hasNextInt = scanner.hasNextInt(); // checks if number qualifies as int, if it doesn't it will return false instead of an error.
            if (hasNextInt) {
                int num = scanner.nextInt(); // next int is something that scanner class has to convert string into int! no need to use Integer.parseInt
                counter++;
                sum += num;
            } else {
                System.out.println("invalid number");
            }
            scanner.nextLine(); //Handles End of line: Enter Key ---- Next line is needed to enter  more than one input after the other!
            if (counter == 10) {
                break;
            }
        }
        System.out.println(sum);
        scanner.close();


    }

    public static void minAndMax() {

        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int min = 0;
        boolean first = true;
        int max = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter #: " + order + ":");


            boolean hasNextInt = scanner.hasNextInt(); // checks if number qualifies as int, if it doesn't it will return false instead of an error.
            if (hasNextInt) {
                int num = scanner.nextInt(); // next int is something that scanner class has to convert string into int! no need to use Integer.parseInt
                if (first) {
                    first = false;
                    min = num;
                    max = num;
                }
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                counter++;
            } else {
                System.out.println("invalid number");

                break;
            }
            scanner.nextLine(); //Handles End of line: Enter Key ---- Next line is needed to enter  more than one input after the other!
//            if (counter == 10) {
//                break;
//            }
        }
        System.out.println("Min Num: " + min + " Max num: " + max);
        scanner.close();


    }
}