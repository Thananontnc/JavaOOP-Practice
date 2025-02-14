package Employee;

// Main class
public class Main {
    // DisplayBonus method to invoke showDetails and calculate bonus
    public static void displayBonus(Employee obj) {
        obj.showDetails();
        System.out.println("Bonus: $" + obj.calculateBonus());
        System.out.println(); // Adding space for readability
    }

    public static void main(String[] args) {
        // Creating objects of Manager and Developer
        Manager manager = new Manager("Alice", 70000, "HR");
        Developer developer = new Developer("Bob", 80000, "Java");

        // Calling displayBonus for both objects
        displayBonus(manager);
        displayBonus(developer);
    }
}
