package textadventuregame;

import java.util.Random;

public class Wolf extends Enemy {

    Random rand = new Random();
    
    public Wolf() {
        maxHealth = 45;
        maxAttackDamage = 20;
        dropRate = 0.15f;
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
