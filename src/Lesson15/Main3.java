package Lesson15;

import Lesson15.Model.Goods;
import Lesson15.Service.GoodsService;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        GoodsService goodsService = new GoodsService();

        List<Goods> goodsList = new ArrayList<>();
        goodsList.add(new Goods(goodsService.getName(), goodsService.price(), goodsService.rating()));
        goodsList.add(new Goods(goodsService.getName(), goodsService.price(), goodsService.rating()));
        goodsList.add(new Goods(goodsService.getName(), goodsService.price(), goodsService.rating()));
        goodsList.add(new Goods(goodsService.getName(), goodsService.price(), goodsService.rating()));
        goodsList.add(new Goods(goodsService.getName(), goodsService.price(), goodsService.rating()));


        goodsList.sort(Goods.NameComporator);
        goodsService.printList(goodsList);

        goodsList.sort(Goods.PriceComporator);

        goodsList.sort(Goods.RatingComporator);


    }

}

