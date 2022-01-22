package Lesson20;

public class Dead extends Thread {

    public void get() {
        synchronized (String.class) {
            synchronized (Integer.class) {
                synchronized (Long.class) {
                    System.out.println("1 2 3");
                }
            }
        }
    }

    public void get1() {
        synchronized (Integer.class) {
            synchronized (String.class) {
                synchronized (Long.class) {
                    System.out.println("1 2 3");
                }
            }
        }
    }


    public void get2() {
        synchronized (Long.class) {
            synchronized (String.class) {
                synchronized (Long.class) {
                    System.out.println("1 2 3");
                }
            }
        }
    }

    @Override
    public void run() {
        get();
        get1();
        get2();
    }

    public static void main(String[] args) {
        Dead thread1 = new Dead();
        thread1.start();
        Dead thread2 = new Dead();
        thread2.start();
        Dead thread3 = new Dead();
        thread3.start();
    }
}
