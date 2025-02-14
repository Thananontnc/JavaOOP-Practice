package Ex12;

public class Residential extends Customer {
    
    private  double ratePerUnit;

    
    public Residential(String name , int unitsConsumed , double ratePerUnit){
        super(name, unitsConsumed);
        this.ratePerUnit = ratePerUnit;
    }

    public double  getRatePerUnit() {
        return this.ratePerUnit;
    }
    
    @Override
    public void calculateBill() {
        System.out.println("Residential Customer: "+getName()+", Units Consumed: "+getUnitsConsumed()+", Rate per Unit: "+ getRatePerUnit());
        System.out.println("Total Bill Amount: $"+(getUnitsConsumed() * getRatePerUnit()));
    }


}
