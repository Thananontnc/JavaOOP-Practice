package Ex3;

public class Students {
    protected  String name;
    protected String studentID;
    protected Double GPA;

    public Students(String name,String studentID,Double GPA) {
        this.name = name;
        this.studentID = studentID;
        this.GPA = GPA;
    }
    // setter Method 
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(String StudentID) {
        this.studentID = StudentID;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    // getter method
    public String getName() {
        return this.name;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public double getGPA() {
        return this.GPA;
    }

    public void displayStudent() {
        System.out.println("Student Details:");
        System.out.println("Name: "+this.name);
        System.out.println("Student ID: "+this.studentID);
        System.out.println("GPA: "+this.GPA);
        System.out.println();
    }
}
