package textadventuregame;

public abstract class Enemy {
    
    int maxHealth;
    int maxAttackDamage;
    int dropRate;
   
    // Each enemy will have different attack
    public abstract int enemyAttack();



}
