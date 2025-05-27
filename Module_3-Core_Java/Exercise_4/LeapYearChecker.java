public class LeapYearChecker {
    public static void main(String[] args) {
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter a year: ");
            int year = sc.nextInt();
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            System.out.println(year + " is " + (isLeapYear ? "a Leap Year" : "not a Leap Year"));
        }
    }
    
}
