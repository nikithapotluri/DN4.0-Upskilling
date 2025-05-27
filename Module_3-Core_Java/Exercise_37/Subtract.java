public class Subtract {
    public int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Subtract sc = new Subtract();
        int result = sc.sub(53, 32);
        System.out.println("Answer: " + result);
    }
}