package Ex2;

public class Employee {
    private  String name;
    private int age ;
    private double salary;

    public Employee(String name , int age , double salary) {
        this.name  = name;
        this.age = age ;
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;  
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(double  salary) {
        this.salary = salary;
    }
    
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getSalary() {
        return this.salary;
    }

    public void giveRaise(double amount) {
        this.salary += amount;
    }

    public void displayEmployee() {
        System.out.println("Employee Details:");
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Salary: "+this.salary);
        System.out.println();
    }
}
