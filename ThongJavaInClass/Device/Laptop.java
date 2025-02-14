package Device;

public class Laptop extends Device {

    public Laptop(String brand, String model){
        super(brand,model);
    }

    public void operate(){ 
        System.out.println("Performing computing tasks");

    }    
}
