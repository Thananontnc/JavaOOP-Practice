package Electronic;

public class Laptop extends Electronic {
    private int battery;

    public Laptop(String brand, double Power, int battery) {
        super(brand, battery);
        this.battery = battery;
    }
    
    public double cal() {
        return getpower() / battery;
    }

    public void details() {
        super.details();
        System.out.println("Screen Size: " + battery + " inches");
    }
}
