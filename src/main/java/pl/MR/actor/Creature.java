package pl.MR.actor;

import pl.MR.WeaponType;

public abstract class Creature {

    protected int hp;
    protected boolean alive;
    protected int strength;
    protected WeaponType weaponType;

    public Creature(int hp, boolean alive, int strength, WeaponType weaponType) {
        this.hp = hp;
        this.alive = alive;
        this.strength = strength;
        this.weaponType = weaponType;
    }


    public void receiveDemage(int dmg) {
        hp -= dmg;
        if (hp <= 0) {
            alive = false;
            System.out.println("received " + dmg + " dmg");
        }
    }


    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getStrength() {
        return strength;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }


    @Override
    public String toString() {
        return "Creature{" +
                "hp=" + hp +
                ", alive=" + alive +
                ", strength=" + strength +
                ", weaponType=" + weaponType +
                '}';
    }
}
