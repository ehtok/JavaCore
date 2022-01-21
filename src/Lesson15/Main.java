package Lesson15;

import Lesson15.Model.Product;

import java.util.HashMap;
import java.util.Map;
//Создайте HashMap, содержащий пары значений  - имя игрушки и объект игрушки (класс Product с произвольными полями).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов  - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.

public class Main {

    public static void main(String[] args) {
        Map<String, Product> toys = new HashMap<>();
        toys.put("Doll", new Product("Masha"));
        toys.put("Pet", new Product("Dog"));
        toys.put("Car", new Product("BMW"));
        printMap(toys);
        printName(toys);
        printValue(toys);

    }

    private static void printValue(Map<String, Product> toys) {
        for (Product value : toys.values()
        ) {
            System.out.println(value);

        }
    }

    private static void printName(Map<String, Product> toys) {
        for (String name : toys.keySet()
        ) {
            System.out.println(name);

        }
    }

    private static void printMap(Map<String, Product> toys) {
        for (Map.Entry<String, Product> element : toys.entrySet()
        ) {
            System.out.println(element);

        }
    }
}
