package Ex8;

public class Smartphone extends Device {
    private String os;

    public Smartphone(String model, int battery,String os) {
        super(model, battery);
        this.os = os;
    }

    public String getOS() {
        return this.os;
    }
    
    @Override
    public void turnOn() {
        System.out.println("Smartphone: Model "+ getModel()+", Battery "+getBattery()+"%");
        System.out.println("The smartphone is now ON.");
        System.out.println("Welcome to "+getOS()+".");
    }

    @Override
    public void turnOff() {
        System.out.println("The smartphone is now OFF.");
        System.out.println();
    }


}
