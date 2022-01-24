package Lesson20;

public class Dead {

    public static void main(String[] args) {

        DeadA deadA = new DeadA();
        deadA.start();
        DeadB deadB = new DeadB();
        deadB.start();

    }

}

class DeadA extends Thread {
    void getA() {
        synchronized (String.class) {
            synchronized (Integer.class) {
                System.out.println("1 2 3");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            getA();
        }
    }
}

class DeadB extends Thread {
    void getB() {
        synchronized (Integer.class) {
            synchronized (String.class) {
                System.out.println("1 2 3");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            getB();
        }
    }
}
