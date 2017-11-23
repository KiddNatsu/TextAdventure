package textadventuregame;

public abstract class Enemy {
    
    int maxHealth;
    int health;
    int attackDamage;
    int dropRate;
   
    // Each enemy will have different attack
    public abstract int enemyAttack();



}
