package Lesson20.Model;

public class Producer implements Runnable {
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public synchronized void run() {
        while (Shop.count < Shop.FINISH) {
            shop.addProduct();
            Shop.count++;
        }


    }
}
