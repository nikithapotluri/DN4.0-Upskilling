import java.util.HashMap;
import java.util.Scanner;

public class StudentMap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        try (Scanner sc = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter student ID (or -1 to stop): ");
                int id = sc.nextInt();
                if (id == -1) break;
                sc.nextLine(); // clear buffer
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                studentMap.put(id, name);
            }

            System.out.print("Enter ID to search: ");
            int searchId = sc.nextInt();
            System.out.println("Student: " + studentMap.getOrDefault(searchId, "Not found"));
        }
    }
}
