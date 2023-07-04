import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    public static String getInputFromConsole(int currentYear) {


        String name = System.console().readLine("Hi, What is your name?");

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What Year were you born?");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old!";

    }

    public static String getInputFromScanner(int currentYear) {
        Scanner sc = new Scanner(System.in);

        // String name = System.console().readLine("Hi, What is your name?");
        System.out.println("Hi, Whats your name?");
        String name = sc.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        //  String dateOfBirth = System.console().readLine("What Year were you born?");
        System.out.println("What Year where you born?");
        boolean validDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a Year of Birth >= " + (currentYear - 125) + " and <= " + currentYear);
            //String dateOfBirth = sc.nextLine();
           // age = currentYear - Integer.parseInt(dateOfBirth);
            try {
                age = checkData(currentYear, sc.nextLine());
                validDOB = age < 0 ? false : true;
            }catch(NumberFormatException badUserInput){

                System.out.println("Characters not allowed! Try Again.");
            }
        } while (!validDOB);
        //String dateOfBirth = sc.nextLine();
        // int age = currentYear - Integer.parseInt(dateOfBirth);
        return "So, you are " + age + " years old!";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;
        if (dob < minYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}