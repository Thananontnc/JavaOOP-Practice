public class Employee {
    //  Attribute 
    public String id;
    public String name;
    public Double salary;

    // Constructor
    public Employee() {
        this.id = "0";
        this.name = "Unknown";
        this.salary = 15000.00;
    }    

    public Employee(String id , String name , Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        System.out.println("Create Object Completed");
    }

    // Static Attribute 
    static int minSalary = 12000;

    public void setId(String id) {   
        this.id = id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayEmployee() {
        // System.out.println("ID : " + this.id);
        System.out.println("Name : " + this.name);
        System.out.println("Salary : " + this.salary);
    }

    public String getName() {
        return this.name;   
    }
    public double  getSalary() {
        return this.salary;   
    }
    public String getId() {
        return this.id;   
    }

}
