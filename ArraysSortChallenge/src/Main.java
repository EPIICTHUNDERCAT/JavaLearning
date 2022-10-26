import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("Enter Count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] returnedArray = MinimumElement.readIntegers(count);

        int returnedMin = MinimumElement.findMin(returnedArray);

        System.out.println("min = " + returnedMin);


//    String string = new String();
//    string = "home";
//
//        int[] myArray = new int[9];
//        System.out.println(Arrays.toString(myArray));
//        myArray.toString();
//        System.out.println(myArray);
//        int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8, 9};


//        int[] myInts = getIntegers(5);
//        int[] sorted = sortIntegers(myInts);
//        printArray(sorted);


    }

}
//
//
//    public static int[] getIntegers(int cap) {
//        int[] array = new int[cap];
//        System.out.println("Enter: " + cap + " int value:\r");
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner.nextInt();
//        }
//        return array;
//    }
//
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Element: " + i + " contents " + array[i]);
//        }
//
//    }
//
//    public static int[] sortIntegers(int[] array) {
////        int[] sortedArray = new int[array.length];
////        System.out.println("array lenght" + sortedArray);
////        for (int i = 0; i < array.length; i++) {
////            sortedArray[i] = array[i];
////
////        }
//        int[] sortedArray = Arrays.copyOf(array, array.length);
//
//        boolean flag = true;
//
//        int temp;
//        while (flag) {
//            flag = false; // Flag is set to false in the start, because its meant to stop
//            for (int i = 0; i < sortedArray.length - 1; i++) { // loops through the array elements
//                if (sortedArray[i] < sortedArray[i + 1]) { // if the current element is less than the next element, implement code below, else continue
//                    temp = sortedArray[i]; // temporarily setting the current element we are comparing to temp to STORE it
//                    sortedArray[i] = sortedArray[i + 1]; // setting the current element to the new element so that it moves up one since it was less than
//                    sortedArray[i + 1] = temp; //setting the new element back to temp.
//
//                    flag = true;
//
//                }
//            }
//        }
//
//
//        return sortedArray;
//    }
//
//
//}