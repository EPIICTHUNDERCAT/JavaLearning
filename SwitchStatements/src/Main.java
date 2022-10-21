
public class Main {


    public static void main(String[] args) {
//        int value = 3;
//
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }


        DayOfWeek.printDayOfTheWeek(0);
        DayOfWeek.printDayOfTheWeek(1);
        DayOfWeek.printDayOfTheWeek(2);
        DayOfWeek.printDayOfTheWeek(3);
        DayOfWeek.printDayOfTheWeek(4);
        DayOfWeek.printDayOfTheWeek(5);
        DayOfWeek.printDayOfTheWeek(6);
        DayOfWeek.printDayOfTheWeek(43);


        char switchCharValue = 'D';

        switch (switchCharValue) {
            case 'A':
                System.out.println("Char was  A");
                break;
            case 'B':
                System.out.println("Char was  B");
                break;
            case 'C':
                System.out.println("Char was  C");
                break;

            case 'D':
                System.out.println("Char was  D");
                break;

            case 'E':
                System.out.println("Char was  E");
                break;

            default:
                System.out.println("Character was NOT found but it was: " + switchCharValue);
                break;


        }


        String month = "JUNE";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            case "april":
                System.out.println("Apr");
                break;

            case "may":
                System.out.println("May");
                break;

            case "october":
                System.out.println("Oct");
                break;

            default:
                System.out.println("Character was NOT found but it was: " + month);
                break;


        }


//
//        int switchValue = 4;
//
//        switch (switchValue) {
//            case 1:
//                System.out.println("the value was 1");
//                break;
//            case 2:
//                System.out.println("Value was two");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("was not 3,4,or 5");
//                System.out.println("actually it was" + switchValue);
//                break;
//            default:
//                System.out.println("was not 1 or 2");
//                break;
//
//
//        }


    }


    public static boolean halvesAreAlike(String s) {

        s = s.toLowerCase();

        int half = s.length() / 2;

        String s2 = s.substring(0, half);
        String s3 = s.substring(half, s.length());

        int s2VowCount = 0;
        int s3VowCount = 0;

        for (int i = 0; i < s2.length(); i++) {

            if (s2.charAt(i) == 'a' || s2.charAt(i) == 'e' || s2.charAt(i) == 'i' || s2.charAt(i) == 'o' || s2.charAt(i) == 'u') {
                s2VowCount++;
            }
        }

        for (int i = 0; i < s3.length(); i++) {

            if (s3.charAt(i) == 'a' || s3.charAt(i) == 'e' || s3.charAt(i) == 'i' || s3.charAt(i) == 'o' || s3.charAt(i) == 'u') {
                s3VowCount++;
            }
            return true;
        }


        return true;
    }

}