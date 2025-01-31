import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        try (Scanner get = new Scanner(System.in)) {
            // Generate a random number between 1 and 10
            int numberToGuess = random.nextInt(10) + 1;
            int userGuess = 0;

            System.out.println("I have selected a number between 1 and 10. Can you guess it?");

            while (userGuess != numberToGuess) {
                System.out.print("Enter your guess: ");
                userGuess = get.nextInt();

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.printf("Congratulations! You guessed the number. It is %d", userGuess);
                }
            }

            get.close();
        }
    }
}
