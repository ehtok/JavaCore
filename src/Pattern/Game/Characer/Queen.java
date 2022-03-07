package Pattern.Game.Characer;

public class Queen extends Character {

    public Queen(String name) {
        super(name);
    }

    @Override
    public void fight() {
        weapon.useWeapon(getName());
    }


}
