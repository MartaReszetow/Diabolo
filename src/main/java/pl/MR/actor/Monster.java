package pl.MR.actor;

import pl.MR.AbleToAttack;
import pl.MR.WeaponType;

public abstract class Monster extends Creature implements AbleToAttack {

    public Monster(int hp, boolean alive, int strength, WeaponType weaponType) {
        super(hp, alive, strength, weaponType);
    }


}
