public class Car {

    private  String brand;
    private String model;
    private int year;


    public Car() {
        this.brand = "Unknown Brand";
        this.model = "Unknown Model";
        this.year = 0;
    }

    public Car(String brand){
        this.brand = brand;
        this.model = "Unknown Model";
        this.year = 0;
    }

    public Car(String brand,String model){
        this.brand = brand;
        this.model = model;
        this.year = 0 ;
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public void printCarInfo() {
        System.out.print("Brand: "+this.brand);
        System.out.print(", Model: "+this.model);
        System.out.print("Year: "+this.year);
    }

}