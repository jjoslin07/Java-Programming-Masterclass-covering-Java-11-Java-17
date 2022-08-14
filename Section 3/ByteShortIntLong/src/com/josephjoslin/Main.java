package com.josephjoslin;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // 32 bits
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Overflow
        System.out.println("Busted MIN value = " + (myMinIntValue - 1)); // Underflow

        int myMaxIntTest = 2_147_483_647; // You can use underscore to separate INT if you want to

        byte myMinByteValue = Byte.MIN_VALUE; // 8 bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);   
        
        short myMinShortValue = Short.MIN_VALUE; // 16 bits
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L; // 64 bits
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTitle = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); // Casting a byte

        short myNewShortValue = (short) (myMinShortValue / 2 ); // Casting a short

    }




}
