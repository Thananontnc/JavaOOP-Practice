package Appliance;

public class Main {
    public static void start(Appliance obj){
        obj.showDetails();
        obj.oparate();
    }

    public static void main(String[] args) {
        WashingMachine M1 = new WashingMachine();
        Refrigerator M2 = new Refrigerator();

        start(M1);
        System.out.println("");
        start(M2);
    }
    
}
