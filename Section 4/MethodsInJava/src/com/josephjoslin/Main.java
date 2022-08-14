package com.josephjoslin;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);
        int score = calculateHighScorePosition(1500);
        displayHighScorePosition("Joseph", score);
        score = calculateHighScorePosition(900);
        displayHighScorePosition("Anthony", score);
        score = calculateHighScorePosition(400);
        displayHighScorePosition("Amber", score);
        score = calculateHighScorePosition(50);
        displayHighScorePosition("John", score);
        score = calculateHighScorePosition(1000);
        displayHighScorePosition("Luis", score);
        score = calculateHighScorePosition(500);
        displayHighScorePosition("Dave", score);
        score = calculateHighScorePosition(100);
        displayHighScorePosition("Frank", score);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1; // -1 is used to indicate an error in search it's used to represent value not found
    }

    public static void displayHighScorePosition(String playerName, int position) { // Also known as a procedure when void
        System.out.println(playerName + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) { // Also known as a function when returning value
//        if (score >= 1000) {
//            return 1;
//        } else if (score >= 500) {
//            return 2;
//        } else if (score >= 100) {
//            return 3;
//        }
//        return 4;
        int position = 4; // assuming position 4 will be returned
        if (score >= 1000) { // better to read and follow with 1 return statement using variable
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;
    }
}


