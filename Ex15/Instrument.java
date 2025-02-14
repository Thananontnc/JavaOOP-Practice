package Ex15;

public class Instrument {
    
    private String type;
    private String material;

    public Instrument() {
        this.type = "Stringed";
        this.material = "Wood";
    }

    

    public void specification() {
        System.out.println("Instument Type: "+type);
        System.out.println("Material: "+material);
    }

    public void play() {
        System.out.println("Unknown Instrument");
    }

    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        guitar.specification();
        guitar.play();  
        System.out.println();
        Piano piano = new Piano();
        piano.specification();
        piano.play();
    }

}
