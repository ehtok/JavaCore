package Pattern.Game;

import Pattern.Game.Characer.King;
import Pattern.Game.Characer.Knight;
import Pattern.Game.Characer.Queen;
import Pattern.Game.Characer.Troll;
import Pattern.Game.Weapon.AxeBehavior;
import Pattern.Game.Weapon.BowAndArrowBehavior;
import Pattern.Game.Weapon.KnifeBehavior;
import Pattern.Game.Weapon.SwordBehavior;

public class Runner {
    public static void main(String[] args) {
        Knight knight = new Knight("Alex");
        knight.setWeapon(new BowAndArrowBehavior());
        knight.fight();

        Troll troll = new Troll("BigBoy");
        troll.setWeapon(new AxeBehavior());
        troll.fight();

        Queen queen = new Queen("Anna");
        queen.setWeapon(new SwordBehavior());
        queen.fight();

        King king = new King("Artur");
        king.setWeapon(new KnifeBehavior());
        king.fight();

    }
}
