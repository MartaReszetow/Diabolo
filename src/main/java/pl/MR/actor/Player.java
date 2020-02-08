package pl.MR.actor;

import pl.MR.AbleToAttack;
import pl.MR.WeaponType;

public class Player extends Creature implements AbleToAttack {
    public Player(WeaponType playerWeapon) {
        super(100,true, 2,playerWeapon);
    }


    @Override
    public int attack() {
        if( weaponType.equals(WeaponType.MACE)){
           hp+=5;
        }
        return strength + weaponType.getDamage()+1;
    }



}
