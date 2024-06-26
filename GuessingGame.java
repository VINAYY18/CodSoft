import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();
            int minRange = 1;
            int maxRange = 100;
            int attempts = 0;
            int score = 0;
            
            System.out.println("Welcome to the Guessing Game!");
            
            boolean playAgain = true;
            while (playAgain) {
                int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                System.out.println("I have generated a number between " + minRange + " and " + maxRange + ". Guess what it is:");
                
                boolean guessedCorrectly = false;
                while (!guessedCorrectly) {
                    int userGuess = scanner.nextInt();
                    attempts++;
                    
                    if (userGuess == randomNumber) {
                        System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                        score++;
                        guessedCorrectly = true;
                    } else if (userGuess < randomNumber) {
                        System.out.println("Too low! Try again:");
                    } else {
                        System.out.println("Too high! Try again:");
                    }
                }
                
                System.out.println("Your current score: " + score);
                attempts = 0;
                
                System.out.println("Do you want to play again? (yes/no)");
                String playAgainResponse = scanner.next();
                if (!playAgainResponse.equalsIgnoreCase("yes")) {
                    playAgain = false;
                    System.out.println("Thanks for playing!");
                }
            }
        }
    }
}