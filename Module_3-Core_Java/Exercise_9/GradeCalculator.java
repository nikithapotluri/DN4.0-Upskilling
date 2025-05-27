import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (out of 100): ");
        int marks = sc.nextInt();
        char grade;

        if (marks >= 90) grade = 'S';
        else if (marks >= 85) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 65) grade = 'C';
        else if (marks >= 55) grade = 'D';
        else if (marks >= 45) grade = 'E';
        else grade = 'F';

        System.out.println("Grade: " + grade);
        sc.close();
    }
}
