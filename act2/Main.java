// 1. Vehicle Class (Must NOT have the 'public' keyword!)
class Vehicle {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize fields
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

    // Method to calculate age
    public int calculateAge() {
        return 2026 - year;
    }

    // Method to check if vintage (>25 years old)
    public boolean isVintage() {
        return calculateAge() > 25;
    }
}

// 2. Main Class
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 2018);
        Vehicle v2 = new Vehicle("Ford", "Mustang", 1995); // Vintage (>25 years old)
        Vehicle v3 = new Vehicle("Honda", "Civic", 2022);

        System.out.println("--- Vehicle 1 ---");
        v1.displayInfo();
        System.out.println("Age: " + v1.calculateAge());
        System.out.println("Is Vintage: " + v1.isVintage());

        System.out.println("\n--- Vehicle 2 ---");
        v2.displayInfo();
        System.out.println("Age: " + v2.calculateAge());
        System.out.println("Is Vintage: " + v2.isVintage());

        System.out.println("\n--- Vehicle 3 ---");
        v3.displayInfo();
        System.out.println("Age: " + v3.calculateAge());
        System.out.println("Is Vintage: " + v3.isVintage());
    }
}
