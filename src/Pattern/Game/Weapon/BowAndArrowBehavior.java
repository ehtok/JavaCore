package Pattern.Game.Weapon;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon(String name) {
        System.out.println(name + " damaged by Bow 15hp");
    }
}
