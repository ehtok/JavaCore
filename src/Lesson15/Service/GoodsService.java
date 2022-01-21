package Lesson15.Service;

import Lesson15.Model.Goods;

import java.util.List;
import java.util.Random;

public class GoodsService implements IGoodsService {

    @Override
    public String getName() {
        String[] goodsName = new String[5];
        goodsName[0] = "Milk";
        goodsName[1] = "Sugar";
        goodsName[2] = "Coffee";
        goodsName[3] = "Cola";
        goodsName[4] = "Butter";
        String randomName = goodsName[new Random().nextInt(goodsName.length)];
        return randomName;
    }

    @Override
    public int price() {
        return (int) (Math.random() * 100 + 1);
    }

    @Override
    public int rating() {
        return (int) (Math.random() * 5 + 1);
    }

    @Override
    public void printList(List<Goods> goodsList) {
        for (Goods element : goodsList
        ) {
            System.out.println(element);

        }
    }
}
