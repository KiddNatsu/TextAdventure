package textadventuregame;

public class LongSword extends Weapon {
    
    public LongSword() {
        attack = 50;
    }

    @Override
    public int useWeapon() {
        return 50;
    }
    
}
