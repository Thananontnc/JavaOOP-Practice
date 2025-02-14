package Electronic;

public class Main {
    public static void test(Electronic obj) {
        obj.details();
        System.out.println("Power Consumption: " + String.format("%.2f", obj.cal()) + " W/unit");
        System.out.println(); // Adding space for readability
    }
    
    public static void main(String[] args) {
        Laptop d1 = new Laptop("Apple", 50.0, 10);
        Smartphone d2 = new Smartphone("Samsung", 20.0, 6.5);

        test(d1);
        System.out.println(" ");
        test(d2);
    }
    
}
