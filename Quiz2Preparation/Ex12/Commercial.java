package Ex12;

public class Commercial extends Customer {
    
    private double ratePerUnit;

    public Commercial(String name , int unitsConsumed,double ratePerUnit) {
        super(name,unitsConsumed);
        this.ratePerUnit =ratePerUnit;
    }


    public double  getRatePerUnit() {
        return this.ratePerUnit;
    }

    @Override
    public void calculateBill() {
        System.out.println("Commercial Customer: "+getName()+", Units Consumed: "+getUnitsConsumed()+", Rate per Unit: "+ getRatePerUnit());
        System.out.println("Total Bill Amount: $"+(getUnitsConsumed() * getRatePerUnit()));
    }




}
