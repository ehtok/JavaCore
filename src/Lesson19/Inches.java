package Lesson19;

import java.util.ArrayList;
import java.util.List;

public class Inches {
    public static void main(String[] args) {
        List<Integer> inches = new ArrayList<>();
        for (int i = 1; i <= 21; i++) {
            inches.add(i);
        }
        inches.stream()
                .peek(x -> System.out.println(x + " inches"))
                .map(x -> x * 2.54)
                .peek(x -> System.out.println(x + " cm"))
                .forEach(Double::intValue);


    }
}
