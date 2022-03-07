package Lesson20.Model;

public class Producer implements Runnable {
    private Shop shop;

    public Producer(Shop shop) {
        this.shop = shop;
    }

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            shop.addProduct();
        }


    }
}
