import java.util.Scanner;

public class GuessingGame {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        int max = 100, min = 1;
        int number = (int) (Math.random() * (max - min + 1) + min);
        int i, K = 5;
        char choice;
        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
        do {
            for (i = 0; i < K; i++) {
                System.out.println("Guess the number:");
                int guess = sc.nextInt();
                if (number == guess) {
                    System.out.println("Congratulations!You guessed the number.");
                    break;
                } else if (number > guess) {
                    System.out.println("The number is greater than " + guess);
                } else if (number < guess) {
                    System.out.println("The number is less than " + guess);
                }
            }
            if (i == K) {
                System.out.println("You have exhausted K trials.");
                System.out.println("The number was " + number);
            }
            System.out.println("Do you want to play another round Y/N");
            choice = sc.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
    }

    public static void main(String args[]) {
        guessingNumberGame();
    }
}