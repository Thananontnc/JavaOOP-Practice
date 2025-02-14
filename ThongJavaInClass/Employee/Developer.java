package Employee;

// Developer class inheriting from Employee
public class Developer extends Employee {
    private String programmingLang;

    // Constructor
    public Developer(String name, double salary, String programmingLang) {
        super(name, salary); // Calls parent constructor
        this.programmingLang = programmingLang;
    }

    // Overriding calculateBonus to return 15% of salary
    @Override
    protected double calculateBonus() {
        return getSalary() * 0.15;
    }

    // Overriding showDetails to include programming language
    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Programming Language: " + programmingLang);
    }
}
