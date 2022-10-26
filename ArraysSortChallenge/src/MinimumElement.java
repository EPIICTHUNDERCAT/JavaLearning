import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static int readElements() {
        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        return count;
    }

    public static int[] readIntegers(int count) {
        int[] myIntArray = new int[count];

        System.out.println("enter value for array: ");
        for (int i = 0; i < myIntArray.length; i++) {
            int number = scanner.nextInt();
            scanner.nextLine();
            myIntArray[i] = number;
        }
        return myIntArray;
    }


    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        //  System.out.println("init min val: " + min);
        for (int i = 0; i < array.length; i++) {
            //   System.out.println("Current Array Element: " + array);
            int val = array[i];
            //  System.out.println("cycled val value: " + val);
            if (val < min) {
                min = val;
                //    System.out.println("new min val: " + min);
            }

        }


        return min;


    }
}
