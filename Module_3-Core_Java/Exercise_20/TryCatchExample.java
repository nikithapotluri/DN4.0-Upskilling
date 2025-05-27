public class TryCatchExample {
    public static void main(String[] args) {
            try {
                int a=5;
                int result = a / 0;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            }
    }
}
