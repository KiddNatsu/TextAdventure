package textadventuregame;

import java.util.Random;

public class Zombie extends Enemy {

    Random rand = new Random();
    
    public Zombie() {
        maxHealth = 75;
        maxAttackDamage = 15;
        dropRate = 0.4f;
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(maxAttackDamage);
    }
    
    @Override
    public String toString() {
        return "Zombie";
    }
}
