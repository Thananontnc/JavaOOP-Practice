package Ex10;

public class Lion extends Animal {
    private int maneSize;

    public Lion(String name , String sound , int maneSize){
        super(name, sound);
        this.maneSize = maneSize;
    }

    public int getManeSize() {
        return this.maneSize;
    }

    @Override
    public void makeSound() {
        System.out.println("Lion Name: "+getName()+", Mane Size: "+getManeSize());
        System.out.println(getSound()+ "! " + getSound()+"!");
    }

}
