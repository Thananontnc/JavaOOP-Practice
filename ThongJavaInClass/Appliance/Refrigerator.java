package Appliance;

public class Refrigerator extends Appliance {
    public Refrigerator(){
        super("Samsung", 200);
    }



    public void operate(){
        System.out.println("Cooling food.");
    }
    
}
