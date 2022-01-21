package Lesson14.Service;

import Lesson14.Model.HeavyBox;

import java.util.List;

public class BoxService implements IBoxService {


    public HeavyBox createBox(int size, int weight) {

        return new HeavyBox(size, weight);
    }

    public void displayArray(List<HeavyBox> array) {
        for (HeavyBox element : array) {
            System.out.println("Box size : " + element.getSize() +
                    " Box weight : " + element.getWeight());
        }

    }

    public void display(List<HeavyBox> pack) {
        for (HeavyBox elements : pack) {
            System.out.println("Box size : " + elements.getSize() +
                    " Box weight : " + elements.getWeight());
        }

    }
}

