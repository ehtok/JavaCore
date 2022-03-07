package Pattern.Duck.ModelDuck;

import Pattern.Duck.Quack.Quack;
import Pattern.Duck.Fly.FlyWithWings;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");

    }

}
