import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] myReversedArray = {13, 255, 32, 443, 55, 66, 3};
        //   System.out.println(myReversedArray[0]);

        System.out.println(myReversedArray.length/2);

        reverse(myReversedArray);
    }


    public static void reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(Arrays.toString(array));
            int temp = array[i];
            System.out.println(temp + " setting it to array element");
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            System.out.println(temp + " is the new array eleemnt in temp");

        }
        System.out.println("reversed array: " + Arrays.toString(array));


    }


}