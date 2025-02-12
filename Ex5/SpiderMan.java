package Ex5;

public class SpiderMan extends Superhero{

    private boolean spiderWeb ;

    public SpiderMan(String name , int strength , int agility,boolean spiderWeb) {
        super(name, strength, agility);
        this.spiderWeb = spiderWeb;
    }
   
    @Override
    public void fight() {
        System.out.println("Spider-Man is fighting with webs!");
    }

    public void shootWeb() {
        System.out.println("Spider-Man shoots webs!");
    }
}
