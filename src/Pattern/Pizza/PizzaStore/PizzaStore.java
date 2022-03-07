package Pattern.Pizza.PizzaStore;

import Pattern.Pizza.Pizza;

public abstract class PizzaStore {


    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("Making a " + pizza.getName());
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);


}
