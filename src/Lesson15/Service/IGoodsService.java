package Lesson15.Service;

import Lesson15.Model.Goods;

import java.util.List;

public interface IGoodsService {
    String getName();
    int price();
    int rating();
    void printList(List<Goods> goodsList);
}
