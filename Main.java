public class Main {

    public static void main(String[] args) {

        int result = Employee.minSalary;
        System.out.println(result);
        System.out.println(Company.name);
        System.out.println(Company.create_at);
        Company.service();
        /*Employee e1 = new Employee("2","Thong",15000.00);
        e1.displayEmployee();

        System.out.println("-----------------------------");

        Employee e2 = new Employee("3","Naphat",30000.00 );
        e2.displayEmployee();

        Employee TestEMP = new Employee();
        TestEMP.displayEmployee(); */

        /*e1.setId("1");
        e1.setName("Thananaon");
        e1.setSalary(200000.0);

        e1.displayEmployee();

        System.out.println("-----------------------------");
        
        Employee e2 = new Employee();
        
        e2.setId("2");
        e2.setName("Prathomporn");
        e2.setSalary(40000.0);

        e2.displayEmployee();

        System.out.println("-----------------------------");

        System.out.println(e1.getName());
        System.out.println(e2.getName());*/
    }
}