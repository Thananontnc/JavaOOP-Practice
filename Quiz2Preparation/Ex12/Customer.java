package Ex12;

public class Customer {
    private  String name;
    private int unitsConsumed;

    public Customer(String name , int unitsConsumed){
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }


    public String getName() {
        return this.name;
    }

    public int getUnitsConsumed() {
        return this.unitsConsumed;
    }

    public void calculateBill() {
        System.out.println();
    }

    public static void main(String[] args) {
        Residential rsd = new Residential("Alice", 250, 0.12);
        rsd.calculateBill();
        System.out.println();
        Commercial cmc = new Commercial("Bob", 400, 0.20);
        cmc.calculateBill();
    }

}
