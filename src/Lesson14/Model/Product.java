package Lesson14.Model;

import java.util.Objects;

//Создайте HashMap, содержащий пары значений - имя игрушки и объект игрушки (класс Product, содержащий размер игрушки и цену).
//Перебрать и распечатать пары значений - entrySet().
//Перебрать и распечатать набор из имен продуктов - keySet().
//Перебрать и распечатать значения продуктов - values().
//Для каждого перебора создать свой метод.
public class Product {
    private int size;
    private int price;

    public Product(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return size == product.size && price == product.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, price);
    }
}
