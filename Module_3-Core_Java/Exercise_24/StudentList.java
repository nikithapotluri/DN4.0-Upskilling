import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in)) {
            while (true) {
                System.out.print("Enter student name (or 'exit'): ");
                String name = sc.nextLine();
                if (name.equalsIgnoreCase("exit")) break;
                students.add(name);
            }
        }

        System.out.println("Student names:");
        for (String s : students) {
            System.out.println(s);
        }
    }
}
