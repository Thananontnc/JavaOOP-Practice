package Ex3;

public class GraduateStudent extends Students {

    private String thesisTitle;

    public GraduateStudent(String name ,String studenid,double gpa,String thesisTitle) {
        super(name, studenid, gpa);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return this.thesisTitle;
    }

    @Override
    public void displayStudent() {
        System.out.println("Graduate Student Details:");
        System.out.println("Name: "+getName());
        System.out.println("Student ID: "+getStudentID());
        System.out.println("GPA: "+getGPA());
        System.out.println("Thesis Title: "+thesisTitle);
        System.out.println();
    }
    
    
}