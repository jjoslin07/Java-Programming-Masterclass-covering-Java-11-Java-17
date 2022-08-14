package com.josephjoslin;

public class Main {

    public static void main(String[] args) {
        // 1. Create a double variable with a value of 20.00
        double myDouble = 20.00d;
        // 2. Create a second variable of type double with the value of 80.00
        double mySecondDouble = 80.00d;
        // 3. Add both numbers together and multiply by 100.00
        double myThirdDouble = (myDouble + mySecondDouble) * 100.00d; // Operator precedence using the () to wrap the addition
        /*
           4. Use the remainder operator to figure out what the remainder from the result of the operation in step 3
            and 40.00. We used the modulus or remainder operator on ints in the course, but we can also use it on
            a double.
         */
        System.out.println("My third double total " + myThirdDouble);
        double remainder = myThirdDouble % 40.00d;
        System.out.println("The remainder = " + remainder);
        // 5. Create a boolean variable that assigns the value true if the remainder in step #4  is 0 , or false if it's not zero
        boolean hasNoRemainder = (remainder == 0) ? true : false;
        // 6. Output the boolean variable
        System.out.println("hasNoRemainder = " + hasNoRemainder);
        /*
            7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step #5 is not true.
            Don't be surprised if you see output for this step, where you might expect it not to show. I'll explain it in my solution.

         */
        if(!hasNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
