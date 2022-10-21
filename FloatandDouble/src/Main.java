public class Main {
    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Val = " + myMinFloatValue);
        System.out.println("Float Max Val = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Val = " + myMinDoubleValue);
        System.out.println("Double Max Val = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        float myCastedFloatValue = (float) 5;
        double myDoubleValue = 5d / 3d;

        System.out.println("Int Value = " + myIntValue);
        System.out.println("float Value = " + myFloatValue);
        System.out.println("Double Value = " + myDoubleValue);


        double poundInteger = 200d;
        double poundConversion = 0.45359237d;
        double myKilogramTotal = poundInteger * poundConversion;

        System.out.println("Total Kilograms from 200 pounds = " + myKilogramTotal);
        boolean myBoolean = Boolean.TRUE;

        double pi = Math.PI;

        System.out.println(pi);
        System.out.println(myBoolean);

    }
}