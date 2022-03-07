package Pattern.Game.Characer;

public class Troll extends Character {
    public Troll(String name) {
        super(name);
    }

    @Override
    public void fight() {
        weapon.useWeapon(getName());
    }
}
