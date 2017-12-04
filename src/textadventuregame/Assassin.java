package textadventuregame;

import java.util.Random;

public class Assassin extends Enemy {

    Random rand = new Random();
    
    public Assassin() {
        maxHealth = 30;
        maxAttackDamage = 50;
        dropRate = 0.5f;
    }
    
    @Override
    public int enemyAttack() {
        return rand.nextInt(maxAttackDamage);
    }
    
    @Override
    public String toString() {
        return "Assassin";
    }
}
