package Ex5;

public class Villain {

    private String name;
    private String evilPower;

    public Villain(String name , String evilPower) {
        this.name = name ;
        this.evilPower = evilPower;
    }

    

    public void plot() {
        System.out.println("Villain is plotting eveil!");
    }

    public void attack() {
        System.out.println("Villain is attacking with evil powers!");
    }
}
