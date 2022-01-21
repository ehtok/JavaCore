package Lesson14.Model;

import java.util.Objects;

public class HeavyBox {
    private int size;
    private int weight;

    public HeavyBox(int size, int weight) {
        this.size = size;
        this.weight = weight;
    }

    public void setSize(int size) {

        this.size = size;
    }

    public void setWeight(int weight) {

        this.weight = weight;
    }

    public int getSize() {

        return this.size;
    }

    public int getWeight() {

        return this.weight;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            HeavyBox heavyBox = (HeavyBox) o;
            return this.size == heavyBox.size && this.weight == heavyBox.weight;
        } else {
            return false;
        }
    }

    public int hashCode() {

        return Objects.hash(new Object[]{this.size, this.weight});
    }
}
