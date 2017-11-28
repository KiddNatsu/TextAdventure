package textadventuregame;

import java.util.Random;

public class Player {
    
    Random rand = new Random();
    int health = 200;
    private int attackDamage = 50;
    // Weapon to be set 
    
    public int attack() {
        return rand.nextInt(attackDamage);
    }
    
}
