package com.gevernova.inbuilt;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);

    public static int generateGuess(int low, int high) {
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(int guess) {
        System.out.println("Is your number " + guess + "? (Enter 'low', 'high', or 'correct')");
        return scanner.nextLine().trim().toLowerCase();
    }

    public static void playGame() {
        int low = 1, high = 100;
        while (true) {
            int guess = generateGuess(low, high);
            String feedback = getUserFeedback(guess);
            if (feedback.equals("correct")) {
                System.out.println("Hooray! I guessed your number.");
                break;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            }
            if (low > high) {
                System.out.println("Inconsistent feedback. Game over.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        playGame();
    }
}

