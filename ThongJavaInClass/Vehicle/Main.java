package Vehicle;

public class Main {
    public static void ride(Vehicle obj){
        obj.specification();
        obj.run();
    }
    public static void main(String[] args) {
        Car myCar = new Car();
        Airplane myAirplane = new Airplane();

        ride(myCar);
        System.out.println();
        ride(myAirplane);
    }
    
}
