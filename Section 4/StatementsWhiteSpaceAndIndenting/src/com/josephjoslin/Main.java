package com.josephjoslin;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50; // The entire line is a Java statement
        if (myVariable == 50) { // Indenting is important to see logical flow of the code you write
            System.out.println("Printed");
        }
        myVariable++; // These are both valid statements
        myVariable--;
        System.out.println("This is a test"); // This is a statement

        System.out.println("This is " + // Java doesn't care about whitespace when you use + operator
                "another " +
                "still more.");

        int anotherVariable = 50;
        myVariable--;
        System.out.println("This is another one"); // 3 expressions on 1 line
    }
}