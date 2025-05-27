import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Guess a number between 1 and 100: ");
            guess = sc.nextInt();
            if (guess < number) System.out.println("Too low!");
            else if (guess > number) System.out.println("Too high!");
            else System.out.println("Correct!");
        } while (guess != number);
        sc.close();
    }
}
