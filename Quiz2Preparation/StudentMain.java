public class StudentMain {

    public static void main(String[] args) {
        Student std1 = new Student("S1001","Alice",18,3.00);
        std1.printStudentInfo();

        Student std2 = new Student();
        std2.printStudentInfo();
    }
}