package Shape;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    protected double area(){
        return 3.14 * radius * radius;
    }
    
}
