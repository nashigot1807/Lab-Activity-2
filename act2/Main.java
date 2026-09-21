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
