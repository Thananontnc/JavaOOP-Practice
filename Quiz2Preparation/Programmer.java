public class Programmer extends Employee {    
    public String skill = "Java , C#";

    public Programmer(String name , Double salary) {
        super(name,salary);
        System.out.println("I'm Programmer");
        System.out.println(skill);
    }
}
