package Lesson20;
//Создать метод, который печатает название потока и засыпает на 2 секунды.
// Запустить одновременно 10 потоков.
// Реализовать механизм синхронизации, чтобы все потоки выполнились последовательно.


public class MyThread extends Thread {

    public static final int SEK = 2000;

    public synchronized void sleep() {
        try {
            sleep(SEK);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        synchronized (MyThread.class) {
            sleep();
            System.out.println(getName());

        }
    }
}

