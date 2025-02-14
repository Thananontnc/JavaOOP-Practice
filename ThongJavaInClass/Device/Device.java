package Device;

public class Device {
    private String brand;
    private String model;

    public Device(String brand, String model) {
    this.brand = brand;
    this.model = model;
    }
    public void details() {
        System.out.println("Device brand: " + brand);
        System.out.println("Device model: " + model);

    }

    protected void operate() {}


    
}
