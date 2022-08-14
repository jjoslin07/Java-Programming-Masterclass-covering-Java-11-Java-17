package com.josephjoslin;

public class Main {

    public static void main(String[] args) {
        /*
            CHALLENGE
            Convert a given number of pounds to kilograms.

            STEPS:
                1. Create a variable with the appropriate type to store the number of pounds
                to be converted to kilograms.
                2. Calculate the result i.e. the number of kilograms based on the contents of the
                variable above and store the result in a 2nd appropriate variable.
                3. Print out the result.
            HINT : 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation.
         */

        // SOLUTION
        double numberOfPounds = 200d;
        double convertedKilograms =  0.45359237d * numberOfPounds;
        System.out.println(numberOfPounds + " pound(s) is equal to " + convertedKilograms + " kilo(s)");

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);
    }
}
