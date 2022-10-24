import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private int sum;

    public static void main(String[] args) {


        int[] myInts = getIntegers(5);
        for (int i = 0; i < myInts.length; i++) {
            System.out.println("elements: " + i + "typed val was " + myInts[i]);
        }

        System.out.println("Average is: " + getAverage(myInts));
//
//        int[] myIntArray = new int[10];
//        for (int i = 0; i < 10; i++) {
//            myIntArray[i] = i * 10;
//        }
//        for (int i = 0; i < myIntArray.length; i++) {
//            System.out.println(i + myIntArray[i]);
//        }


        //  int[] myVar = {1,2,3,4,5,6,7,8,9,10};

        //  myVar = new int[10];

        //set at 6
        //   myVar[5] = 50;

//        double[] myDArray = new double[10];
//        System.out.println(myVar[5]);
    }

    public static int[] getIntegers(int number) {

        System.out.println("enter" + number + "int values. \r");

        int[] values = new int[number];


        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();

        }
        return values;

    }


    public static double getAverage(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];


        }


        return (double) sum / (double) array.length;
    }

}