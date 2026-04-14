import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int totalScore = 0;
        int rounds = 3;     // number of rounds

        for (int i = 1; i <= rounds; i++) {

            int number = rand.nextInt(100) + 1;
            int attempts = 5;
            int guess;
            boolean correct = false;

            System.out.println("\nRound " + i);
            System.out.println("Guess a number between 1 and 100");
            System.out.println("You have " + attempts + " attempts");

            for (int j = 1; j <= attempts; j++) {

                System.out.print("Enter your guess: ");
                guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("Correct! You guessed the number.");
                    totalScore += (attempts - j + 1) * 10; // scoring
                    correct = true;
                    break;
                }

                else if (guess > number) {
                    System.out.println("Too High!");
                }

                else {
                    System.out.println("Too Low!");
                }
            }

            if (!correct) {
                System.out.println("You lost! The number was: " + number);
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("Your Total Score: " + totalScore);

        sc.close();
    }
}