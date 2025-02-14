package Ex2;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Alice", 30, 50000);
        emp1.displayEmployee();

        Manager mgr1 = new Manager("Bob", 40, 80000, "IT");
        mgr1.displayEmployee();
    }
}
