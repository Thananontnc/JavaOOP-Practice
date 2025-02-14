package Electronic;

public class Smartphone extends Electronic {
    private double screen;

    public Smartphone(String brand, double Power, double screen) {
        super(brand,Power);
        this.screen = screen;
    }
    
    public double cal() {
        return getpower() / screen;
    }

    public void details() {
        super.details();
        System.out.println("Screen Size: " + screen + " inches");
    }
}
