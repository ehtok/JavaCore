package Lesson14.Model;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void voice() {
        System.out.println("Dogs says Bark");
    }
}
