package Ex5;

public class Superhero {
    private String name;
    private int strength;
    private int agility;

    public Superhero(String name , int  strength, int agility) {
        this.name = name;
        this.strength = strength;
        this.agility = agility;
    }

    


    public void fight() {
        System.out.println("Superhero is fighting!");
    }

    public void savePeople() {
        System.out.println("Superhero is saving people!");
    }

}
class Main {

    public static void main(String[] args) {
        SpiderMan spm = new SpiderMan("Spider-Man", 90, 95, true);
        spm.fight();
        spm.shootWeb();

        System.out.println();

        Villain villain = new Villain("Green Goblin", "Pumpkin Bombs");
        villain.plot(); 
        villain.attack();
    }
}