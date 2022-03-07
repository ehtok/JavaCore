package Pattern.Starbuzz;

import Pattern.Starbuzz.Coffee.Beverage;
import Pattern.Starbuzz.Coffee.DarkRoast;
import Pattern.Starbuzz.Coffee.Espresso;
import Pattern.Starbuzz.Coffee.HouseBlend;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.TALL);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());


        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
