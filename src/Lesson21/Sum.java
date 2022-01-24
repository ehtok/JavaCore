package Lesson21;

import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sum implements Callable<String> {
    public static final int SLEEP = new Random().nextInt(10) * 1000;


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());

        List<Integer> numberList = Stream.generate(() -> new Random().nextInt(100))
                .limit(10)
                .collect(Collectors.toList());
        String sum = String.valueOf(numberList.stream()
                .reduce(Integer::sum)
                .get());
        Thread.sleep(SLEEP);


        return sum;
    }
}
