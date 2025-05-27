public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        
        // Testing the overloaded methods
        System.out.println("Sum of 5 and 10: " + mo.add(5, 10)); 
        System.out.println("Sum of 5, 10 and 15: " + mo.add(5, 10, 15)); 
        System.out.println("Sum of 5.5 and 10.5: " + mo.add(5.5, 10.5)); 
    }
    
}
