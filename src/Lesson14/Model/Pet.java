package Lesson14.Model;
//Создайте класс Pet и его наследников Cat, Dog, Parrot.
// Создайте отображение из домашних животных, где в качестве ключа выступает имя животного,
// а в качестве значения класс Pet. Добавьте в отображение разных животных.
// Создайте метод выводящий на консоль все ключи отображения.

import Lesson14.Service.IPetService;

import java.util.Map;

public class Pet implements IPetService {
    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public void voice() {
    }
}
