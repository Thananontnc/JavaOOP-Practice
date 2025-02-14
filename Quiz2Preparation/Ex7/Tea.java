package Ex7;


public class Tea extends Beverage {
    private String flavor;

    public Tea(String name , int size, String flavor){
        super(name, size);
        this.flavor =  flavor;
    }



    public String getFlavor() {
        return this.flavor;
    }

    @Override
    public void prepare() {
         System.out.println("Tea: "+" Name "+ getName() + " Size "+ getSize()+"ml"+", Type: "+getFlavor());
         System.out.println("Preparing tea leaves...");
         System.out.println("Your "+getName()+ " "+getFlavor()+ "is ready!");
         System.out.println();
    }

}
