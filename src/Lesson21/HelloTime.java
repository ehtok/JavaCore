package Lesson21;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;
import java.util.concurrent.Callable;

public class HelloTime implements Callable<String> {
    private String file;

    synchronized void writeFile(String file) {
        try (FileWriter fw = new FileWriter("task.txt")) {
            fw.write(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public String call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        file = "Hello World" + "\n" + LocalTime.now().toString() ;
        writeFile(file);

        return Thread.currentThread().getName();
    }
}
