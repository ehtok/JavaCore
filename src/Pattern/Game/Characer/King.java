package Pattern.Game.Characer;

public class King extends Character {
    public King(String name) {
        super(name);
    }

    @Override
    public void fight() {
        weapon.useWeapon(getName());
    }
}
