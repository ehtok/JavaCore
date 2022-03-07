package Pattern.Pizza.Ingredients;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ExtraThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoesSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Mushroom(), new Onion(), new Garlic()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshCalms();
    }
}
