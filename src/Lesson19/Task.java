package Lesson19;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Сгенерируйте List коллекцию целых чисел из n элементов от minValue до
//maxValue. Определить, содержаться ли в данной коллекции числа, которые делятся и на 3 и на 5 с помощь stream.

public class Task {
    private static final int COUNT = 100;

    private static int randomNumber() {
        return (int) (Math.random() * 500 + 1);
    }


    public static void main(String[] args) {
        List<Integer> integerList = Stream.generate(Task::randomNumber)
                .limit(COUNT)
                .filter(integer -> integer % 3 == 0 && integer % 5 == 0)
                .collect(Collectors.toList());


        for (Integer elements : integerList
        ) {
            System.out.println(elements);

        }


    }
}
