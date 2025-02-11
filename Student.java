
public class Student {
    
    private String studentID;
    private String name;
    private int age;
    private double grade;

    public Student() {
        this.studentID = "Unknown ID";
        this.name = "Unknown Name";
        this.age = 5;
        this.grade = 0.0;
    }

    public Student(String studentID, String name, int age, double grade) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getGrade() {
        return this.grade;
    }

    public void setStudentID(String studentid) {
        this.studentID = studentid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age >= 5 ) {
            this.age = age;
        }
        else{
            System.out.println("Invalid age! Age must be at least 5.");
        }
    }
    public void setGrade(double grade) {
        if (grade <= 4.0 && grade >= 0.0) {
           this.grade = grade; 
        }
        else{
            System.out.println("Invalid grade! Grade must be between 0.0 and 4.00");
        }
    }
    
    public void printStudentInfo() {
        System.out.println("Student ID : " + this.studentID);
        System.out.println("Name : " + this.name);
        System.out.println("Age : "+ this.age);
        System.out.println("Grade : "+this.grade);
    }   
    


}
