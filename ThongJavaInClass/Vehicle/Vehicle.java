package Vehicle;

public class Vehicle {
    private String engine;
    private String fuel;

    public Vehicle(){
        this.engine = "Hybrid engines";
        this.fuel = "Gasoilne / Electric";
    }

    public void specification(){
        System.out.println("The vehicle engine: " + engine);
        System.out.println("The used fuel: " + fuel);

    }

    public void run(){}

    
}
