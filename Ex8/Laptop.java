package Ex8;

public class Laptop extends Device{
    
    private int ram;

    public Laptop(String model, int battery , int ram) {
        super(model,battery);
        this.ram = ram;
    }

    public int  getRam() {
        return  this.ram;
    }
    
    @Override
    public void turnOn() {
        System.out.println("Laptop: Model "+ getModel()+", Battery "+getBattery()+"%");
        System.out.println("The laptop is now ON.");
        System.out.println("Booting macOS...");
    }

    @Override
    public void turnOff() {
        System.out.println("The laptop is now OFF.");
    }


}
