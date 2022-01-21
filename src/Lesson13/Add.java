package Lesson13;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Add {
    private final int MILLION = 1000000;
    private final int HUNDREDK = 100000;


    List al = new ArrayList();
    List ll = new LinkedList();

    public void addLl() {
        for (int x = 0; x <= MILLION; x++) {
            ll.add(1);
        }
    }

    public void getLl() {
        for (int x = 0; x <= HUNDREDK; x++) {
            ll.get((int) Math.random());
        }
    }

    public void addSizeLl() {
        for (int x = 0; x <= HUNDREDK; x++) {
            ll.add(ll.size() / 2, 1);
        }
    }


    public void getAl() {
        for (int x = 0; x <= HUNDREDK; x++) {
            al.get((int) Math.random());
        }
    }


    public void addAL() {
        for (int x = 0; x <= MILLION; x++) {
            al.add(1);
        }
    }

    public void addSizeAl() {
        for (int x = 0; x <= HUNDREDK; x++) {
            al.add(al.size() / 2, 1);

        }


    }


    public static void main(String[] args) {
        Add million = new Add();
        Instant start1 = Instant.now();
        million.addAL();
        million.getAl();
        million.addSizeAl();
        Instant end1 = Instant.now();
        Duration interval1 = Duration.between(start1, end1);
        System.out.println("Время: " + interval1.getSeconds());


        Add million1 = new Add();
        Instant start = Instant.now();
        million1.addLl();
        million1.addLl();
        million1.addSizeLl();
        Instant end = Instant.now();
        Duration interval = Duration.between(start, end);
        System.out.println("Время: " + interval.getSeconds());


    }


}

