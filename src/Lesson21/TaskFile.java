package Lesson21;

//Создать задачу Callable, которая генерирует 10 файлов с 10 произвольными строками ->
// засыпает произвольно на 1-3 секунды, результат выполнения –
// коллекция имен файлов. Запустить 10 задач параллельно в пуле из 3 потоков.
// Вывести ход программы на экран с указанием имени потока,
// который выполняет работу.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;


public class TaskFile implements Callable<Collection<String>> {
    private static final int SLEEP = new Random().nextInt(3) * 1000;
    private static final int TEN= 10;


    @Override
    public Collection<String> call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        List<String> nameCollection = new ArrayList<>();
        for (int i = 1; i <= TEN; i++) {
            File file = new File("text" + i + ".txt");
            nameCollection.add(String.valueOf(file));
            try (FileWriter fileWriter = new FileWriter(file)) {
                for (int j = 1; j <= TEN; j++) {
                    fileWriter.write(new Random().nextInt(100) + "\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        Thread.sleep(SLEEP);

        return nameCollection;
    }
}
