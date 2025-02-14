package Employee;

// Abstract parent class Employee
public abstract class Employee {
    private String name;
    private double salary;

    // Constructor
    public Employee(String name, double salary) {
        if (salary < 0) { // Handling edge case
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.name = name;
        this.salary = salary;
    }

    // Public method to display details
    public void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: $" + salary);
    }

    // Abstract method for calculating bonus (to be overridden)
    protected abstract double calculateBonus();

    // Getter for salary (optional, but useful)
    public double getSalary() {
        return salary;
    }
}
