package Pattern.Pizza;

import Pattern.Pizza.Ingredients.*;

import java.util.Arrays;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public String getName() {
        return name;
    }

    abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350°");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", veggies=" + Arrays.toString(veggies) +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                ", clams=" + clams +
                '}';
    }
}
