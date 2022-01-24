package Lesson20.Model;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

//Есть 3 производителя и 2 потребителя, все разные потоки и работают все
//одновременно. Есть очередь с 200 элементами. Производители добавляют
//случайное число от 1..100, а потребители берут эти числа. Если в очереди
//элементов >= 100 производители спят, если нет элементов в очереди –
// потребители спят. Если элементов стало <= 80 производители просыпаются.
// Все это работает до тех пор, пока обработанных элементов не станет 10000
// , только потом программа завершается.

public class Shop {
    private Queue<Integer> shopQueue = new ArrayDeque<>();


    private int randomAdd() {
        return new Random().nextInt(100);
    }

    public void add() {
        for (int i = 0; i < 200; i++) {
            shopQueue.add(randomAdd());
        }
    }

    public synchronized void sellProduct() {
        while (shopQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        shopQueue.remove();
        System.out.println("Customer buy product!");
        System.out.println("Product on storage: " + shopQueue.size());
        notify();
    }

    public synchronized void addProduct() {
        while (shopQueue.size() >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        if (shopQueue.size() <= 80) {
            shopQueue.add(randomAdd());
            System.out.println("Product add");
            System.out.println("Product on storage: " + shopQueue.size());
            notify();
        }
    }

}
