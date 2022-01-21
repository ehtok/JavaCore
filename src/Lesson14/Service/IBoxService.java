package Lesson14.Service;

import Lesson14.Model.HeavyBox;

import java.util.List;

public interface IBoxService {
    HeavyBox createBox(int size, int weight);

    void displayArray(List<HeavyBox> array);

    void display(List<HeavyBox> pack);
}

