package Ex1;

public class Vehicle {

    protected String engine;
    protected String fuel;

    public Vehicle() {
        this.engine = "Hybrid engines";
        this.fuel = "Gasoline / Electric";
    }

    public void run() {
        System.out.println();
    }
    

    public void specification() {
        System.out.println("The vehicle engine: "+this.engine);
        System.out.println("The used fuel: "+this.fuel);
    }


}
class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.specification();
        car.run();

        Airplane air = new Airplane();
        air.specification();
        air.run();
    }
    
}  
