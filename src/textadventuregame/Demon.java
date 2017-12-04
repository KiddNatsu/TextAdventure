package textadventuregame;

import java.util.Random;

public class Demon extends Enemy {
        
    Random rand = new Random();
    
    public Demon() {
        maxHealth = 150;
        maxAttackDamage = 35;
        dropRate = 0.25f;
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
