package Lesson21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainFile {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);


        Callable<Collection<String>> collectionCallable = new TaskFile();
        List<Future<Collection<String>>> futureList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Future<Collection<String>> submit = executor.submit(collectionCallable);
            futureList.add(submit);

        }

        executor.shutdown();
    }
}
