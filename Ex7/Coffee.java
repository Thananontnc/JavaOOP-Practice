package Ex7;

public class Coffee extends Beverage {

    private String type;

    public Coffee(String name , int size , String type) {
        super(name, size);
        this.type = type;
    }


    public String getType() {
        return this.type;
    }

    @Override
    public void prepare() {
         System.out.println("Coffee: "+" Name "+ getName() + " Size "+ getSize()+"ml"+", Type: "+getType());
         System.out.println("Preparing hot coffee...");
         System.out.println("Your "+getName()+ " "+getType()+ "is ready!");
         System.out.println();
    }
    
    

}
