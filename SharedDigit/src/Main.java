public class Main {
    public static void main(String[] args) {
//        hasSharedDigit(50, 85);
//        hasSharedDigit(-50, 85);
//        hasSharedDigit(10, 85);
//        hasSharedDigit(55, 55);
//        hasSharedDigit(11, 22);
//        hasSharedDigit(111, 221);
//        hasSharedDigit(100, 10);

        hasSameLastDigit(100, 1000, 100);
        hasSameLastDigit(101, 1000, 100);
        hasSameLastDigit(100, 1001, 100);
        hasSameLastDigit(100, 1000, 101);
        hasSameLastDigit(100, -1000, 100);
        hasSameLastDigit(100, 1000, 1020);
        hasSameLastDigit(11, 22, 31);
        isValid(37822);
        isValid(221);
    }


    public static boolean hasSameLastDigit(int num1, int num2, int num3) {

        int num1Verification = num1;
        int num2Verification = num2;
        int num3Verification = num3;
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {

            while ((num1Verification > 9) && (num2Verification > 9) && (num3Verification > 9)) {
                int extractedNumA = num1Verification % 10;
                num1Verification /= 10;
                //   System.out.println(extractedNumB);
                //   System.out.println(extractedNumA);
                // num1Verification = extractedNumB;
                int extractedNumB = num2Verification % 10;
                num2Verification /= 10;
                //  System.out.println(extractedNumC);
                //  System.out.println(extractedNumD);
                // num2Verification = extractedNumD;
                int extractedNumC = num3Verification % 10;
                num3Verification /= 10;


                if ((extractedNumA == extractedNumB) && (extractedNumB == extractedNumC)) {
                    System.out.println("This statement is true");
                    return true;
                } else if ((extractedNumA == extractedNumB) || (extractedNumB == extractedNumC) || (extractedNumC == extractedNumA)) {
                    System.out.println("Atleast 1 of two is true");
                    return true;
                } else
                    System.out.println("This is very False");
                return false;
            }


        }
        System.out.println("Out Of Bounds");
        return false;
    }


    public static boolean isValid(int valid) {
        if ((valid >= 10 && valid <= 1000)) {
            System.out.println("is valid");
            return true;
        }
        System.out.println("not valid");

        return false;
    }


    public static boolean hasSharedDigit(int num1, int num2) {

        int num1Verification = num1;
        int num2Verification = num2;

        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {

            while ((num1Verification > 9 && num2Verification > 9)) {
                int extractedNumA = num1Verification % 10;
                int extractedNumB = num1Verification / 10;
                //   System.out.println(extractedNumB);
                //   System.out.println(extractedNumA);
                num1Verification = extractedNumB;
                int extractedNumC = num2Verification % 10;
                int extractedNumD = num2Verification / 10;
                //  System.out.println(extractedNumC);
                //  System.out.println(extractedNumD);
                num2Verification = extractedNumD;

                if ((extractedNumA == extractedNumC) || (extractedNumA == extractedNumD)) {
                    System.out.println("This statement is true");
                    return true;
                } else if ((extractedNumB == extractedNumC) || (extractedNumB == extractedNumD)) {
                    System.out.println("This statement is true");
                    return true;
                } else {
                    System.out.println("This is very False");
                    return false;
                }
            }


/*
            while (num1Verification > 9) {
                int extractedNumA = num1Verification % 10;
                int extractedNumB = num1Verification / 10;
                System.out.println(extractedNumB);
                System.out.println(extractedNumA);
                num1Verification = extractedNumB;
                //   break;
            }
            while (num2Verification > 9) {
                int extractedNumC = num2Verification % 10;
                int extractedNumD = num2Verification / 10;
                System.out.println(extractedNumC);
                System.out.println(extractedNumD);
                num2Verification = extractedNumD;
                //   continue;
            }

*/
        }
        System.out.println("Out Of Bounds");
        return false;
    }
}