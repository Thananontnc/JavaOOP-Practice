/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 * Section: 544
 */
class Mage extends GameCharacter {
    private int mana;

    public Mage(String name, int health, int attackPower, int mana) {
        super(name, health, attackPower);
        this.mana = mana;
    }


    @Override
    public void specialAbility() {
        if (mana >= 10) {
            System.out.println(name + " casts Fireball! Deals " + (attackPower * 2) + " damage.");
            mana -= 10;
        } else {
            System.out.println(name + " does not have enough mana to cast Fireball!");
        }
    }


    public void regainMana(int amount) {
        mana += amount;
        System.out.println(name + " regained " + amount + " mana. Current mana: " + mana);
    }

    @Override
    public void displayCharacterInfo() {
        super.displayCharacterInfo();
        System.out.println("Mana: " + mana);
    }
}