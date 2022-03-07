package Pattern.Game.Weapon;

public class AxeBehavior implements WeaponBehavior {


    @Override
    public void useWeapon(String name) {
        System.out.println(name + " damaged by Axe 8hp");
    }
}
