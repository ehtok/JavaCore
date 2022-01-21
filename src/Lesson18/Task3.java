package Lesson18;


//Создать объект Person c полями name, surname, age. Сгенерировать 10
//объектов класса Person со случайными полями соответствующего типа.
// С помощью Java создать файл, в который запишется информация о этих людях(Записать как объект).
// Затем прочесть. Для записи и чтения использовать отдельные методы.

import Lesson18.Model.Person;
import Lesson18.Service.PersonService;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        PersonService personService = new PersonService();


        List<Person> personList = Stream.generate(() -> new Person(personService.getName(), personService.getSurname(), personService.age()))
                .limit(SIZE)
                .collect(Collectors.toList());

        writePerson(personList);

        try (FileInputStream fis = new FileInputStream("persons");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            System.out.println(ois.readObject());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void writePerson(List<Person> personList) {
        try (FileOutputStream fos = new FileOutputStream("persons");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(personList);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

