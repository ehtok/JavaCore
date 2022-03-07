package Pattern.Game.Weapon;

public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon(String name) {

        System.out.println(name + " damaged by Sword 10hp");
    }
}
