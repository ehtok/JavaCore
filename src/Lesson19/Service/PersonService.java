package Lesson19.Service;

import java.util.List;
import java.util.Random;

public class PersonService implements IPersonService {


    @Override
    public String randomName() {
        String[] names = new String[5];
        names[0] = "Pasha";
        names[1] = "Nick";
        names[2] = "Lena";
        names[3] = "Alisa";
        names[4] = "Ben";
        String randomName = names[new Random().nextInt(names.length)];
        return randomName;
    }

    @Override
    public String randomSurname() {
        String[] surnames = new String[5];
        surnames[0] = "Petrov";
        surnames[1] = "Ivanov";
        surnames[2] = "Black";
        surnames[3] = "Vasil";
        surnames[4] = "Lee";
        String randomSurname = surnames[new Random().nextInt(surnames.length)];
        return randomSurname;
    }

    @Override
    public int randomAge() {
        return (int) (Math.random() * 30 + 15);
    }
}
