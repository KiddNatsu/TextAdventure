package textadventuregame;

import java.util.Random;

public class Assassin extends Enemy {

    Random rand = new Random();
    
    public Assassin() {
        maxHealth = 30;
        health = rand.nextInt(maxHealth);
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(50);
    }
    
}
