package com.thundercat.coding;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Int Min Value = " + myMinIntValue);
        System.out.println("Int Max Value = " + myMaxIntValue);
        System.out.println();

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("MIN VALUE = " + myMinByteValue);
        System.out.println("MAX VALUE = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("MIN VALUE = " + myMinShortValue);
        System.out.println("MAX VALUE = " + myMaxShortValue);
        
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        long myLongValue = 100L;

        System.out.println("MIN VALUE = " + myMinLongValue);
        System.out.println("MAX VALUE = " + myMaxLongValue);
        long myLongLongValue = 2_147_483_647_345L;
        System.out.println(myLongLongValue);

        short bigShortLiteralValue = 32767;


        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue =(short) (myMinShortValue / 2);


        System.out.println("int " + myTotal);
        System.out.println("byte " + myNewByteValue);
        System.out.println("short " + myNewShortValue);



        byte myChallengeByteVariable = 50;

        short myChallengeShortVariable = 100;

        int myChallengeIntVariable = 3000;

        long myChallengeLongVariable = 50_000L + 10 * (myChallengeByteVariable + myChallengeIntVariable + myChallengeShortVariable);

        System.out.println(myChallengeLongVariable);


    }

}
