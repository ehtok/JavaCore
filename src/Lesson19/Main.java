package Lesson19;

import Lesson19.Model.Person;
import Lesson19.Service.PersonService;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final int COUNT = 100;
    private static final int MAX_AGE = 21;

    public static void main(String[] args) {

        PersonService personService = new PersonService();

        List<String> collect = Stream.generate(() -> new Person(personService.randomName(), personService.randomSurname(), personService.randomAge()))
                .limit(COUNT)
                .peek(person -> System.out.print(person + "\n"))
                .filter(person -> person.getAge() < MAX_AGE)
                .sorted(Comparator.comparing(Person::getName).thenComparing(Person::getSurname))
                .map(Person::getSurname)
                .collect(Collectors.toList());


    }
}
