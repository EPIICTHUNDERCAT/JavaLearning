public class BarkingDog {


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (!barking || hourOfDay < 0 || hourOfDay > 23 || (hourOfDay > 7 && hourOfDay < 23)) {
            System.out.println("False");
            return false;

        }
        System.out.println("true");
        return true;
    }


//    public static void shouldWakeUp(boolean barking, int hourOfDay) {
//
//
//        if (barking && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay == 23) {
//
//            System.out.println(barking);
//        } else if (!barking && hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 23) {
//
//            System.out.println(barking);
//
//        } else if (hourOfDay < 0) {
//
//            System.out.println(!barking);
//
//        } else {
//
//            System.out.println(!barking);
//
//        }
//
//
//    }


}
