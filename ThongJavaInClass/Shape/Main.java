package Shape;

public class Main {
    public static void calculate(Shape obj){
        obj.details();
        System.out.println("Area: " + obj.area());
        System.out.println();

    }
    public static void main(String[] args) {
        Circle cirlce = new Circle(5);
        Rectangle rectangle = new Rectangle(8,5);

        calculate(cirlce);
        calculate(rectangle);
    }
}
