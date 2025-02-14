package Ex3;

public class Main {
    public static void main(String[] args) {
        Students std = new Students("John Doe", "S12345", 3.8);
        std.displayStudent();

        GraduateStudent gds = new GraduateStudent("John Doe", "S12345", 3.8,"Machine Learning in Healthcare");
        gds.displayStudent();
    }
}
