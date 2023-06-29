public class Main {
    public static void main(String[] args) {
        int number = 0;

        while (number < 15) {
            number++;

            if (number <= 5) {

                System.out.println("Skipping Number: " + number);
                continue;
            }
            System.out.println("working with numbers: " + number);
            if (number >= 10) {
                System.out.println("Breaking at: " + number);
                break;

            }


        }


//        int initNumber = 1;
//        int finishNumber = 60;
//        int count = 0;
//
//        while (initNumber <= finishNumber) {
//            initNumber++;
//            if (!isEvenNumber(initNumber)) {
//                //  break; // completed stops the loop.
//                continue; // A break but doesnt exit the execution, it continues to the next number
//            }
//
//            System.out.println("Even Number: " + initNumber);
//            count++;
//            if (count >= 5){
//                break;
//            }
//        }
//        System.out.println("Total Even Numbers Found is: " + count);
////        while (count != 6) {
//
//            System.out.println("Count Value is " + count);
//            count++;
//        }
//        count = 1;
//        while (true) {
//            if (count == 5) {
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }
//
//        count = 6;
//        do {
//            System.out.println("Doing Count Value WASS: " + count);
//            count++;
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);


    }

    public static boolean isEvenNumber(int a) {
        if (a % 2 != 0) {
            //  System.out.println(a + " Is NOT an Even Number");
            return false;
        }
        //System.out.println(a + " Is an Even Number");
        return a % 2 == 0;


    }
}