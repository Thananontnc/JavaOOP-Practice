package Ex4;

public class Applicance {
    
    private String brand;
    private int power;


    public Applicance(String brand, int power) {
        this.brand = brand;
        this.power = power;
    }


    public String getBrand() {
        return this.brand;
    }

    public int  getPower() {
        return this.power;
    }

    public void turnOn() {
        System.out.println();
    }

    public void turnOff() {
        System.out.println();
    }

}
