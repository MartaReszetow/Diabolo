package pl.MR.actor;

import pl.MR.WeaponType;

public class Goblin extends Monster {


    public Goblin() {
        super(30, true, 8, WeaponType.MACE);
    }

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }

}
