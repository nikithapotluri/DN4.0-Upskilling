public class Car {
    String make, model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayDetails() {
        System.out.println("Car: " + make + " " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        Car c1 = new Car("Toyota", "Camry", 2020);
        Car c2 = new Car("Honda", "Civic", 2022);
        c1.displayDetails();
        c2.displayDetails();
    }
    
}
