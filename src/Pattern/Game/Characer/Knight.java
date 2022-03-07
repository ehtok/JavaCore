package Pattern.Game.Characer;

public class Knight extends Character {
    public Knight(String name) {
        super(name);
    }

    @Override
    public void fight() {
        weapon.useWeapon(getName());
    }
}
