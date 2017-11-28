package textadventuregame;

import java.util.Random;

public class Wolf extends Enemy {

    Random rand = new Random();
    
    public Wolf() {
        maxHealth = 45;
        maxAttackDamage = 20;
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(maxAttackDamage);      
    }
    
    @Override
    public String toString() {
        return "Wolf";
    }
}
