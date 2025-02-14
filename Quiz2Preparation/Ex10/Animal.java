package Ex10;

public class Animal {
    private String name;
    private String sound;

    public Animal(String name,String sound){
        this.name = name;
        this.sound = sound;
    }

    public String getName() {
        return this.name;
    }

    public String getSound() {
        return this.sound;
    }

    public void makeSound() {
        System.out.println("Animal Sound Hong Hong !!!!");
    }

}

class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", "Roar", 20);
        lion.makeSound();
        
        System.out.println();

        Elephant eleplant = new Elephant("Dumbo", "Trumpet!", 150);
        eleplant.makeSound();
    }
}