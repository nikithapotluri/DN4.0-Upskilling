import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String data = sc.nextLine();

            try (FileWriter writer = new FileWriter("output.txt")) {
                writer.write(data);
                System.out.println("Data written to output.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
