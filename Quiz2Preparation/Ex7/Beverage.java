package Ex7;

public class Beverage {
    private String name;
    private int size;

    public Beverage(String name , int size) {
        this.name = name;
        this.size = size;
    }
    

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void prepare() {
        System.out.println();
    }

}

class Main {

    public static void main(String[] args) {
        Coffee cff = new Coffee("Espresso",250, "Arabica");
        cff.prepare();

        Tea tea = new Tea("Green Tea", 300, "Jasmine");
        tea.prepare();
    }
    
}
