package pl.MR;

public abstract class Monster extends Creature implements AbleToAttack {

    public Monster(int hp, boolean alive, int strength, WeaponType weaponType) {
        super(hp, alive, strength, weaponType);
    }
}
