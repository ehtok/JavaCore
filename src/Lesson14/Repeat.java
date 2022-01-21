package Lesson14;
//Пользователь вводит набор чисел в виде одной строки "1, 2, 3, 4, 4, 5".
// Избавиться от повторяющихся элементов в строке и вывести результат на экран.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Repeat {
    private final String number;

    public Repeat(String number) {

        this.number = number;
    }

    public String getNumber() {

        return number;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите набор чисел в виде одной строки ");
        String num = sc.nextLine();
        Repeat str = new Repeat(num);

        Set<Character> delRepeat = new HashSet<>();

        for (Character s : str.number.toCharArray()
        ) {
            delRepeat.add(s);

        }

        for (Character elements : delRepeat
        ) {
            System.out.println(elements);
        }
    }
}

