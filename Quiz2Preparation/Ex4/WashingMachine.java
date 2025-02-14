package Ex4;

public class WashingMachine extends Applicance {
    
    private  int capacity;

    public WashingMachine(String brand,int power,int capacity) {
        super(brand, power);
        this.capacity = capacity;
    }
    

    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public void turnOn() {
        System.out.println("Washing Machine: Brand " + getBrand() + ", Power " + getPower() + "W");
        System.out.println("The washing machine is now ON.");
        System.out.println("Washing clothes...");
    }

    @Override
    public void turnOff() {
        System.out.println("The washing machine is now OFF.\n");
    }

}
