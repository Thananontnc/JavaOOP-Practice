/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 * Section: 544
 */
abstract class GameCharacter {
    protected String name;
    protected int health;
    protected int attackPower;

    public GameCharacter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public abstract void specialAbility();


    public void attack(GameCharacter opponent) {
        System.out.println(name + " attacks " + opponent.name + " for " + attackPower + " damage!");
        opponent.takeDamage(attackPower);
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " now has " + health + " HP remaining.");
        }
    }


    public void displayCharacterInfo() {
        System.out.println("Character: " + name);
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
    }
}