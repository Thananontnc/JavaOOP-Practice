package Ex2;

public class Manager extends Employee {
    private String department;

    public Manager(String name , int age , double salary , String department) {
        super(name, age, age);
        this.department  = department;
    }
    public String getDepartment() {
        return department;
    }
    
    @Override
    public void displayEmployee() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Salary: " + getSalary());
        System.out.println("Department: " + department);
        System.out.println();
    }
}
