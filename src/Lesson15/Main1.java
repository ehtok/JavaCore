package Lesson15;
//Создать TreeSet содержащий HeavyBox (вес, размер).
// HeavyBox должен реализовать интерфейс Comparable(сортировка по весу, если вес одинаковый то по размеру).
// Распечатать содержимое с помощью for each.


import Lesson15.Model.HeavyBox;

import java.util.Set;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        Set<HeavyBox> heavyBoxSet = new TreeSet<>();
        heavyBoxSet.add(new HeavyBox(5, 5));
        heavyBoxSet.add(new HeavyBox(8, 5));
        heavyBoxSet.add(new HeavyBox(2, 5));
        printSet(heavyBoxSet);


    }

    private static void printSet(Set<HeavyBox> heavyBoxSet) {
        for (HeavyBox element : heavyBoxSet
        ) {
            System.out.println(element);

        }
    }
}
