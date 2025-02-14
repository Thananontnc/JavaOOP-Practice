package Ex14;

public class Vehicle {
    private String engine;
    private String fuel;

    public Vehicle(){
        this.engine = "Hybrid engines";
        this.fuel = "Gasoline / Electric";
    }

    public void specification() {
        System.out.println("The vehicle engine: "+this.engine);
        System.out.println("the used fuel: "+this.fuel);
    }

    public void  run() {
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Car car = new Car();
        car.specification();
        car.run();

        System.out.println();

        Airplane airplane = new Airplane();
        airplane.specification();
        airplane.run();
    }
}
