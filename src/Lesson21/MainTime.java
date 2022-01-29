package Lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainTime {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> fileList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fileList.add(executor.submit(new HelloTime()));
        }
        executor.shutdown();
    }
}
