package Electronic;

public class Electronic {
    private String brand;
    private double power;

    public Electronic() {
        this.brand = "Unknown brand";
        this.power = 0.0;
    }

    public Electronic(String brand, double power) {
        this.brand = brand;
        this.power = power;
    }

    public void details() {
        System.out.println("Device brand: " + brand);
        System.out.println("Power: " + power);
    }

    protected double cal() {
        return 0.0;
    }

    public double getpower() {
        return power;
    }
    
}
