public class CarMain {
    public static void main(String[] args) {
        Car hondaCRV = new Car();
        Car toyotaCorolla = new Car("Toyota","Corolla",2020);

        hondaCRV.printCarInfo();
        System.out.println();
        toyotaCorolla.printCarInfo();

        hondaCRV.setBrand("Kuay");
        System.out.println(hondaCRV.getBrand());

    }
}
