package Ex4;

public class Refrigerator extends Applicance{
    
    private int temperature;

    public Refrigerator(String brand,int power,int temperature) {
        super(brand, power);
        this.temperature = temperature;
    }

    

    public int getTemperature() {
        return this.temperature;
    }

    @Override
    public void turnOn() {
        System.out.println("Refrigerator: Brand " + getBrand() + ", Power " + getPower() + "W");
        System.out.println("The refrigerator is now ON.");
        System.out.println("Cooling the items...");
    }

    @Override
    public void turnOff() {
        System.out.println("The refrigerator is now OFF.");
    }



}
