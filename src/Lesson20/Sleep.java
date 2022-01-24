package Lesson20;

public class Sleep implements Runnable {

    //Создать метод, который печатает название потока и засыпает на 2 секунды.
// Запустить одновременно 10 потоков.
// Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.
    public synchronized void sleep() {
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        sleep();
    }

    public static void main(String[] args) {
        Sleep m = new Sleep();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(m);
            thread.start();
        }
    }


}
