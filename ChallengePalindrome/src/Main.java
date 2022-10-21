public class Main {
    public static void main(String[] args) {
        System.out.println("Is this a palindrome? " + isPalindrome(121));
//        System.out.println("Is this a palindrome? " + isPalindrome(-156051));
//        System.out.println("Is this a palindrome? " +  isPalindrome(111));
//        System.out.println("Is this a palindrome? " +  isPalindrome(1221));
//        System.out.println("Is this a palindrome? " +  isPalindrome(150));


//        FirstLastDigitSum.sumFirstAndLastDigit(-130);
//        FirstLastDigitSum.sumFirstAndLastDigit(1);
//        FirstLastDigitSum.sumFirstAndLastDigit(437);
//        FirstLastDigitSum.sumFirstAndLastDigit(138);
//        FirstLastDigitSum.sumFirstAndLastDigit(137);
        //  FirstLastDigitSum.sumFirstAndLastDigit(99350);

    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }


        int reverse = 0;
        int temp = number;
        while (number > 0) {

            System.out.println("inserted number:" + number);

            int lastDigit = number % 10;
            System.out.println("Last Digit Input: " + lastDigit);

            reverse = (reverse * 10) + lastDigit;
            System.out.println("Current Reverse: " + reverse);

            System.out.println("Current number being used:" + number);
            number /= 10;
            System.out.println("current number: " + number);

            continue;
        }

        if (temp == reverse) {
            //System.out.println(number);
            // System.out.println("The New Reverse is: " + reverse);
            return true;
        } else
            //    System.out.println("They are not Palindrome");
            return false;

    }


}