package textadventuregame;

public abstract class Enemy {
    
    private int health;
    private int attackDamage;
    
    // Each enemy will have different attack
    public abstract int enemyAttack();
    
}
