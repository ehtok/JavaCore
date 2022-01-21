package Lesson13;

import java.util.*;


//Создать коллекцию, заполнить ее случайными целыми числами. Удалить повторяющиеся числа.

public class Collect {
    private static final int TEN = 10;

    public static void main(String[] args) {
        List<Integer> collect = new ArrayList<>();
        for (int x = 0; x < Collect.TEN; x++) {
            collect.add((int) (Math.random() * 10) + 1);
        }

        collect = new ArrayList<>(new HashSet<>(collect));

        for (Integer element : collect) {
            System.out.println(element);
        }

    }
}



