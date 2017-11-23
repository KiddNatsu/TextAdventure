package textadventuregame;

import java.util.Random;

public class Zombie extends Enemy {

    Random rand = new Random();
    
    public Zombie() {
        maxHealth = 75;
        health = rand.nextInt(maxHealth);
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(15);
    }
    
}
