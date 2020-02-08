package pl.MR;

public abstract class Creature {

    int hp;
    boolean alive;
    int strength;
    WeaponType weaponType;

    public Creature(int hp, boolean alive, int strength, WeaponType weaponType) {
        this.hp = hp;
        this.alive = alive;
        this.strength = strength;
        this.weaponType = weaponType;
    }


}
