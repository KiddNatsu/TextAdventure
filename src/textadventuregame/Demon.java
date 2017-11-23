package textadventuregame;

import java.util.Random;

public class Demon extends Enemy {
        
    Random rand = new Random();
    
    public Demon() {
        maxHealth = 150;
        health = rand.nextInt(maxHealth);
    }

    @Override
    public int enemyAttack() {
        return rand.nextInt(35);
    }
    
}
