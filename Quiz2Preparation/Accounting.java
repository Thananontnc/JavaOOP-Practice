public class Accounting extends Employee{

    public String skill = "Money Management";

    public Accounting(String name , Double salary) {
        super(name,salary);
        System.out.println("I'm Accounting");
        System.out.println(skill);
    }
    

    

}
