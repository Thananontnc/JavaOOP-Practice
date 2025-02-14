package Ex8;

public class Device {
    private String model;
    private int battery;

    public Device(String model , int battery) {
        this.model = model;
        this.battery = battery;
    }

    public String getModel() {
        return this.model;
    }

    public int  getBattery() {
        return this.battery;
    }
    public void turnOn() {
        System.out.println(getModel() + " is now ON.");
    }

    public void turnOff() {
        System.out.println(getModel() + " is now OFF.");
    }
    

}
class Main {
    public static void main(String[] args) {
        Smartphone smp = new Smartphone("IPhone 14", 85, "IOS");
        smp.turnOn();
        smp.turnOff();

        Laptop lp = new Laptop("MacBook Pro", 65, 16);
        lp.turnOn();
        lp.turnOff();
    }
}