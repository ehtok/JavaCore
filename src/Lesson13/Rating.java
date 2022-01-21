package Lesson13;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными оценками.
// Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.List;


public class Rating {
    private static final int TEN = 10;
    private static final int BADRATING = 4;


    public static void main(String[] args) {
        List<Integer> rating = new ArrayList<>();


        for (int x = 0; x < Rating.TEN; x++) {
            rating.add((int) (Math.random() * 10) + 1);
        }


        for (int i = 0; i <= rating.size() - 1; i++) {
            if (rating.get(i) < BADRATING) {
                System.out.println("Плохие оценки : " + rating.remove(i));
                i--;
            }
        }


        for (Integer element : rating) {
            System.out.println("Хорошие оценки : " + element);

        }


    }
}

