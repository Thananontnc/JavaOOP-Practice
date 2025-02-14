package Q2;

public class Main {
    public static void ride(Vehicle obj) {
        obj.specification();
        obj.run();
    }


    public static void main(String[] args) {
        Car mycar = new Car();
        Airplane myplane = new Airplane();

        ride(mycar);
        System.out.println();
        ride(myplane);
    }
    
}
