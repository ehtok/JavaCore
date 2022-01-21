package Lesson13;

import java.util.*;
//Создать список оценок учеников с помощью ArrayList,
// заполнить случайными оценками. Найти самую высокую оценку с использованием итератора.

public class RatingUp {
    private static final int TEN = 10;

    public static void main(String[] args) {
        List<Integer> rating = new ArrayList<>();

        for (int x = 0; x < RatingUp.TEN; x++) {
            rating.add((int) (Math.random() * 10) + 1);
        }

        int high = rating.get(0);

        System.out.println(Collections.max(rating));

        Iterator<Integer> iterator = rating.iterator();

        while (iterator.hasNext()) {
            int rate = iterator.next();
            if (rate >= high) {
                high = rate;
            }

        }

        System.out.println(high);


    }
}



