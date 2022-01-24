package Lesson21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainSum {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        List<Future<String>> sum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sum.add(executor.submit(new Sum()));
        }

        for (Future<String> elements : sum
        ) {
            try {
                System.out.println(elements.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
    }


}
