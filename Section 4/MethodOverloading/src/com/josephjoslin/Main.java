package com.josephjoslin;

public class Main {

    public static void main(String[] args) {
//        int newScore = calculateScore("joe", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(500);
//        calculateScore(600);
//        calculateScore();

        calcFeetAndInchesToCentimeters(12, 12);
        calcFeetAndInchesToCentimeters(144);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static void calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
    }

    public static void calculateScore() {
        System.out.println("No player name, no player score");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters+ " cm");
            return centimeters;
        } else {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            System.out.println("Invalid inches parameter");
            return -1;
        }
    }
}
