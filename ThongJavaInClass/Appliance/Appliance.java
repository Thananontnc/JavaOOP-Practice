package Appliance;

public class Appliance {
    private String brand;
    private int power;

    public Appliance() {
        this.brand = "";
        this.power = 0;
    }

    public Appliance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }

    public void showDetails(){
        System.out.println("Appliance brand: " + brand);
        System.out.println("Power usage: " + power +"W");
    }

    protected void oparate(){
        System.out.println(" ");
    }
    
}
