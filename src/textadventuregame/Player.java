package textadventuregame;

import java.util.Random;

public class Player {
    
    Random rand = new Random();
    int health = 150;
    int healthPotions = 3;
    private int attackDamage = 50;
    // Weapon to be set 
    
    public int attack() {
        return rand.nextInt(attackDamage);
    }
    
    public void drinkHealthPotion() {
        int healAmount = 35;
        int maxHealth = 150;
        health = Math.min(health + healAmount, maxHealth);
    }
    
}
