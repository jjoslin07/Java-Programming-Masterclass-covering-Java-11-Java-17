package com.josephjoslin;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE; // 32 bits
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE; // 64 bits
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00; // Double is preferred data type to use with decimals
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("MyFloatValue = " + myFloatValue); // More precise
        System.out.println("MyDoubleValue = " + myDoubleValue); // Even More precise

    }

}
