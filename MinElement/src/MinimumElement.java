import java.util.Scanner;

public class MinimumElement {


    private static int readIntegers() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Count: ");
        int count = 0;
        count = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Your Array will have " + count + " Elements");
        return count;


    }

    private static int[] readElements(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] readValues = new int[count];
        for (int i = 0; i < readValues.length; i++) {
            int enteredNum = scanner.nextInt();
            scanner.nextLine();
            readValues[i] = enteredNum;
        }
        return readValues;


    }

    private static int findMin(int[] min) {
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < min.length; i++) {

            int value = min[i];

            if (value < minVal) {
                minVal = value;
            }
        }
        System.out.println("You Min Value is: " + minVal);

        return minVal;
    }

}
