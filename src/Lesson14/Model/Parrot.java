package Lesson14.Model;

public class Parrot extends Pet {
    public Parrot(String name) {

        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void voice() {
        System.out.println("Parrots says Chirik");
    }
}
