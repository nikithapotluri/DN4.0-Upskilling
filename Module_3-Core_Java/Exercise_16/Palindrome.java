import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();
            String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();

            System.out.println("Palindrome? " + cleaned.equals(reversed));
        }
    }
}
