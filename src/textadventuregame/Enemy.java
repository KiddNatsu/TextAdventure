package textadventuregame;

public abstract class Enemy {
    
    int maxHealth;
    int maxAttackDamage;
    float dropRate;
   
    // Each enemy will have different attack
    public abstract int enemyAttack();



}
