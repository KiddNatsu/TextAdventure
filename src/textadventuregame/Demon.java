package textadventuregame;

import java.util.Random;

public class Demon extends Enemy {
        
    Random rand = new Random();
    
    public Demon() {
        maxHealth = 150;
        maxAttackDamage = 35;
    }

    @Override
    public int enemyAttack() {
        return rand.nextInt(maxAttackDamage);
    }
    
    @Override
    public String toString() {
        return "Demon";
    }
}
