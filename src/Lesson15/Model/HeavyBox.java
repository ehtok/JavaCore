package Lesson15.Model;

import java.util.Objects;

public class HeavyBox implements Comparable {
    private int size;
    private int weight;

    public HeavyBox(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return size == heavyBox.size && weight == heavyBox.weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, weight);
    }

    @Override
    public String toString() {
        return "size: " + size +
                ", weight: " + weight;

    }


    @Override
    public int compareTo(Object o) {
        HeavyBox box = (HeavyBox) o;
        if (box.weight == weight) {
            return box.size - size;
        }
        return box.weight - weight;
    }
}
