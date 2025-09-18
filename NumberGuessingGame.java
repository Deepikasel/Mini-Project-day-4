import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // 1–100
        int userGuess = 0;
        int attempts = 0;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            
            // Validate input
            if (!scanner.hasNextInt()) {
                System.out.println("⚠️ Please enter a valid number!");
                scanner.next(); // clear invalid input
                continue;
            }

            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < numberToGuess) {
                System.out.println("📉 Too low, try again!");
            } else if (userGuess > numberToGuess) {
                System.out.println("📈 Too high, try again!");
            } else {
                System.out.println("🎉 Correct! You guessed the number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
