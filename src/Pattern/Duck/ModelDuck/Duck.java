package Pattern.Duck.ModelDuck;

import Pattern.Duck.Quack.QuackBehavior;
import Pattern.Duck.Fly.FlyBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}
