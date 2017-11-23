package textadventuregame;

import java.util.Random;

public class Wolf extends Enemy {

    Random rand = new Random();
    
    public Wolf() {
        maxHealth = 45;
        health = rand.nextInt(maxHealth);
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(20);      
    }
    
}
