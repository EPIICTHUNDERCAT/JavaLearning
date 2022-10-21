public class DecimalComparators {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int num1Check = (int) (num1 * 1000);
        int num2Check = (int) (num2 * 1000);

        if (num1Check - num2Check == 0) {
            System.out.println("True");
            return true;
        }

        return false;
    }

}
