package Pattern.Game.Characer;

import Pattern.Game.Weapon.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weapon;
    private String name;

    public Character(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract void fight();

    public void setWeapon(WeaponBehavior w) {
        this.weapon = w;
    }
}
