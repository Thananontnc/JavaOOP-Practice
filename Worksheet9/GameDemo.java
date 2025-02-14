package Worksheet9;
/* 
 * Name: Thananon Chounudom
 * ID: 6711424
 * Section: 544
 */

public class GameDemo {
    public static void main(String[] args) {
        Mage mage = new Mage("Gandalf", 100, 15, 30);

        mage.displayCharacterInfo();

        mage.specialAbility();
        mage.specialAbility();

        mage.regainMana(15);

        GameCharacter warrior = new GameCharacter("Warrior", 120, 20) {
            @Override
            public void specialAbility() {
                System.out.println(name + " enters Berserk Mode! Attack power increases temporarily.");
            }
        };

        warrior.displayCharacterInfo();
        mage.attack(warrior); 
        warrior.attack(mage); 

        mage.displayCharacterInfo();
        warrior.displayCharacterInfo();
    }
}