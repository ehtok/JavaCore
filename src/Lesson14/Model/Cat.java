package Lesson14.Model;

import Lesson14.Service.IPetService;

public class Cat extends Pet implements IPetService {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void voice() {
        System.out.println("Cats says Meow");
    }

}
