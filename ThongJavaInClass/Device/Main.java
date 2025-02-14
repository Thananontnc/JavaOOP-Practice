package Device;

public class Main {
    public static void use(Device obj) {
        obj.details();
        obj.operate();
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Apple", "Macbook Pro");
        Smartphone mySmartphone = new Smartphone("Samsung", "Galaxy S23");

        use(myLaptop);
        System.out.println(" ");
        use(mySmartphone);
    }
    
}
