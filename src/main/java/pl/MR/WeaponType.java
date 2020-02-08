package pl.MR;

public enum WeaponType {
    SWORD(10), MACE(6), UNARMED(1);

    private final int damage;


    public int getDamage() {
        return damage;
    }

    WeaponType(int damage) {
        this.damage = damage;

    }
}
