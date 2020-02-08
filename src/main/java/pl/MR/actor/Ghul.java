package pl.MR.actor;

import pl.MR.WeaponType;

public class Ghul extends Monster {


    public Ghul() {
        super(20, true, 5, WeaponType.UNARMED);
    }

    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}
