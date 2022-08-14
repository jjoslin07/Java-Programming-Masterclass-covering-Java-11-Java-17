package com.josephjoslin;

public class Main {

    public static void main(String[] args) {
        /*
         * Primitive Types Challenge
         * Your challenge is to create a byte variable adn set it to any valid byte number, it doesn't
         * matter. Create a short variable adn set it to any valid short number.
         *
         * Create an int variable and set it to any valid int number. Lastly, create a variable of type
         * long and make it equal to 50,000 plus 10 times the sum of the byte plus the short plus
         * the integer values.
         */

        // SOLUTION
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;
        long longTotal =  50000L + 10L * (byteValue+shortValue+intValue);
        System.out.println(longTotal);

        // SOLUTION WITH CASTING
        short shortTotal = (short) (1000+ 10 *
                (byteValue+shortValue+intValue));
        System.out.println(shortValue);
    }
}
