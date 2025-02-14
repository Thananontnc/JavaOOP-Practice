package Ex11;

public class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String name ,double baseSalary,double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double  getBonus() {
        return  this.bonus;
    }
    
    @Override
    public void calculateSalary() {
        System.out.println("Full-Time Employee: "+getName()+", Base Salary: $"+baseSalary()+", Total Salary: $"+baseSalary() +getBonus());
    }


}
