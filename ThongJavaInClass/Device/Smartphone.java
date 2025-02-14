package Device;

public class Smartphone extends Device {

    public Smartphone(String brand, String model){
        super(brand,model);
    }

    public void operate(){ 
        System.out.println("Making a phone call");
        
    }    
    
    
}
