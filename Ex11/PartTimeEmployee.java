package Ex11;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name , double baseSalary , double hourlyRate , int hoursWorked) {
        super(name, baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }


    public double  getHourlyRate() {
        return this.hourlyRate;
    }

    @Override
    public void calculateSalary() {
        System.out.println("Part-Time Employee: "+getName()+", Hourly Rate: $"+getHourlyRate()+", Hours Worked: "+this.hoursWorked+", Total Salary: $"+(getHourlyRate() * this.hoursWorked));
    }
    



}
