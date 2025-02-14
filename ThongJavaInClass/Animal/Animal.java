package Animal;

public class Animal {
    private String species;
    private String sound;

    public Animal() {
        this.species = "";
        this.sound = ""; 
    }

    public Animal(String species, String sound) {
        this.species = species;
        this.sound = sound;
    }

    public void details() {
        System.out.println("Animal species: " + species);
        System.out.println("Animal sound: " + sound);

    }

    protected void makeSound(){}
    
}
