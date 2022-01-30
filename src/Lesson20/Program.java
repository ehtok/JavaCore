package Lesson20;

import Lesson20.Model.Consumer;
import Lesson20.Model.Producer;
import Lesson20.Model.Shop;

public class Program {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.add();

        Consumer consumer = new Consumer(shop);
        Producer producer = new Producer(shop);

        for (int i = 0; i < 2; i++) {
            Thread threadConsumer = new Thread(consumer);
            threadConsumer.start();
        }

        for (int i = 0; i < 3; i++) {
            Thread threadProducer = new Thread(producer);
            threadProducer.start();
        }


    }
}
