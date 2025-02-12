package Ex1;

public class Vehicle {
    protected String engine;
    protected String fuel;

    public Vehicle() {
        this.engine = "Hybrid enginers";
        this.fuel = "Gasoline / Electric";
    }

    public void specification() {
        System.out.println("The vehicle enginer: " + engine);
        System.out.println("The used fuel: "+fuel);  
    }

    public void run() {
        System.out.println("");
    }
    
}
