package Pattern.Pizza.Ingredients;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickDough();
    }

    @Override
    public Sauce createSauce() {
        return new BlueCheeseSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheddar();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Onion(), new BlackOlives(), new Spinach()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
