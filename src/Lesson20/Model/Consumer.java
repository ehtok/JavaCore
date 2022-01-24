package Lesson20.Model;

public class Consumer implements Runnable {
    private Shop shop;


    public Consumer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            shop.sellProduct();
        }


    }
}
