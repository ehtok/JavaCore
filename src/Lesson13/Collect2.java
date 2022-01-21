package Lesson13;

import java.util.ArrayList;
import java.util.List;
//Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.

public class Collect2 {
    private static final int TEN = 10;

    public static void main(String[] args) {
        List<Integer> Numeric = new ArrayList<>();
        List<Integer> Numeric1 = new ArrayList<>();

        for (int x = 0; x < Collect2.TEN; x++) {
            Numeric.add((int) (Math.random() * 10) + 1);
        }

        for (Integer element : Numeric
        ) {
            System.out.println("Number : " + element);
        }

        for (int i = 0; i < Numeric.size(); i++) {
            if (!Numeric1.contains(Numeric.get(i))) {
                Numeric1.add(Numeric.get(i));
            }
        }

        for (Integer elements : Numeric1
        ) {
            System.out.println("Number1 : " + elements);

        }

        Numeric.removeAll(Numeric1);
    }
}
