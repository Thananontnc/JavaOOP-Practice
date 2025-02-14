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

class Main {
    public static void main(String[] args) {
        WashingMachine  whm = new WashingMachine("LG", 1500,10);
        whm.turnOn();
        whm.turnOff();
        
        Refrigerator rfg = new Refrigerator("Samsung", 800, 4);
        rfg.turnOn();
        rfg.turnOff();
    
    
    
    }
    
}
