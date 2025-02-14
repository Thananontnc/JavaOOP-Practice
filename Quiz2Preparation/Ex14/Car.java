package Ex14;

public class Car extends Vehicle {
    
    protected int wheel;
    
    @Override
    public void run() {
        System.out.println("Run on the road");
    }
}
