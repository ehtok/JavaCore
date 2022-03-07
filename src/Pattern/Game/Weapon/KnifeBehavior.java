package Pattern.Game.Weapon;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon(String name) {
        System.out.println(name + " damaged by Knife 5hp");
    }
}
