package Employee;


public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

    protected double calculateBonus() {
        return getSalary() * 0.2;
    }
    
    public void showDetails() {
        super.showDetails();
        System.out.println("Department: " + department);
    }
}
