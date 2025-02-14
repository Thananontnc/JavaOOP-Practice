package Ex11;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name , double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }   

    public String getName() {
        return  this.name;
    }

    public double  baseSalary() {
        return this.baseSalary;
    }

    public void calculateSalary() {
        System.out.println("Full-Time Employee: "+getName()+", Base Salary: $"+baseSalary);
    }


}

class Main {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee("John", 5000.0 , 1000.0);
        fte.calculateSalary();

        PartTimeEmployee pte = new PartTimeEmployee("Alice",0,15.0,120);
        pte.calculateSalary();

    }
    
}