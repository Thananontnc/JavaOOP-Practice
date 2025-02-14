package Ex10;

public class Elephant extends Animal{
    private int trunkLength;

    public Elephant(String name , String sound,int trunkLength) {
        super(sound, sound);
        this.trunkLength = trunkLength;
    }

    public int  getTrunkLength() {
        return this.trunkLength;
    }   

    @Override
    public void makeSound() {
        System.out.println("Elephant Name: "+getName()+", Trunk Length: "+getTrunkLength());
        System.out.println(getSound()+ "! " + getSound()+"!");
    }
    
    
}
