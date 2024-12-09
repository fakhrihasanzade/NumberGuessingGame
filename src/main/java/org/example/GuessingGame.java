package org.example;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Random random = new Random();
        int target = random.nextInt(101);
        int guess = sc.nextInt();
        int attempts = 0;

        while (attempts < 5) {
            String result = playGame(target, guess);
            if (result.equals("You won")) {
                System.out.println(result);
                break;
            } else if (attempts != 4) {
                System.out.println(result);
                System.out.println("Enter your next guess: ");
                guess = sc.nextInt();
            } else {
                System.out.println("You lost");
                System.out.println("Random number is "+target);
            }
            attempts++;
        }
    }

    public static String playGame(int target, int guess) {
        String result;
        if (target == guess) {
            result = "You won";
            return result;
        } else if (guess < target) {
            result = "Your guess is smaller than the target";
            return result;
        } else {
            result = "Your guess is larger than the target";
            return result;
        }
    }
}