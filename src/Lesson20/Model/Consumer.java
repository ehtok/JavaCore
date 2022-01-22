package Lesson20.Model;

public class Consumer implements Runnable {
    private Shop shop;


    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public synchronized void run() {
        while (Shop.count < Shop.FINISH) {
            shop.sellProduct();
            Shop.count++;
        }


    }
}
