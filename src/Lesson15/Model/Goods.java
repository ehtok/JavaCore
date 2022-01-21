package Lesson15.Model;
//Вместо массивов используйте коллекции.
// Создать метод, распечатывающий товары каталога,
// отсортированные по имени, цене или рейтингу.
// Добавить возможность сортировать в обратном порядке.


import java.util.Comparator;
import java.util.Objects;

public class Goods {
    private String name;
    private int price;
    private int rating;

    public Goods(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods сommodity = (Goods) o;
        return price == сommodity.price && rating == сommodity.rating && Objects.equals(name, сommodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", price: " + price +
                ", rating: " + rating;

    }


    public final static Comparator<Goods> NameComporator = Comparator.comparing(Goods::getName);

    public final static Comparator<Goods> PriceComporator = Comparator.comparingInt(Goods::getPrice);

    public final static Comparator<Goods> RatingComporator = Comparator.comparingInt(o -> o.rating);


}

