package Pattern.Pizza;

import Pattern.Pizza.PizzaStore.CaliforniaPizzaStore;
import Pattern.Pizza.PizzaStore.ChicagoPizzaStore;
import Pattern.Pizza.PizzaStore.NYStylePizzaStore;
import Pattern.Pizza.PizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore californiaPizzaStore = new CaliforniaPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Nick ordered a " + pizza.getName() + "\n");


        pizza = californiaPizzaStore.orderPizza("veggie");
        System.out.println("Jack ordered a " + pizza.getName() + "\n");

        pizza = chicagoPizzaStore.orderPizza("pepperoni");
        System.out.println("Mari ordered a " + pizza.getName() + "\n");


    }
}
