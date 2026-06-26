
import java.util.*;

 class P101_number_guessing_game {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // for generating random numbers

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        int guess;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        do {
            System.out.print("Take a guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
            }
        } while (guess != secretNumber);

        System.out.println("Thanks for playing!");
        sc.close();
    }
}