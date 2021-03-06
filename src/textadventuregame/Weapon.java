package textadventuregame;

public abstract class Weapon {
    
    // Each weapon has various stats
    int attack;
    int defenceChance;
    int missChance;
    
    // Every weapon will be used differently. Some will take certain damage
    // others may have a higher chance of loot etc. 
    public abstract int useWeapon();
    
}
