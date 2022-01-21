package Lesson18;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

//Создать цепочку из трех папок. В конечном каталоге создать 5 произвольных текстовых файлов.
// Заполнить их 10 произвольными целыми числами.
// Содержимое файлов записать в один файл в том же каталоге.
// Создать файл, который будет содержать список файлов данного каталога.
public class Task2 {
    private static final int COUNT = 10;
    private static final int FILE = 5;


    public static void main(String[] args) {


        try {
            Files.createDirectories(Paths.get("path1/path2/path3"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < FILE; i++) {
            File file = new File("path1/path2/path3/text" + i + ".txt");
            try (FileWriter fw = new FileWriter(file)) {
                file.createNewFile();
                for (int y = 0; y < COUNT; y++) {
                    fw.write(Integer.toString(new Random().nextInt(100)) + " ");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                FileReader fileReader = new FileReader(file);
                for (int x = 0; x < COUNT; x++) {
                    System.out.print(fileReader.read() + " ");

                }
                System.out.println();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            File file1 = new File("path1/path2/path3/main");
            try (FileWriter fw = new FileWriter(file1)) {
                for (int y = 0; y < FILE; y++) {
                    try (BufferedReader br = new BufferedReader(new FileReader("path1/path2/path3/text" + y + ".txt"))) {
                        fw.write(br.readLine() + "\n");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }


            File file2 = new File("path1/path2/path3");

            try (FileWriter fw1 = new FileWriter("path1/path2/path3/catalog");
                 BufferedWriter bf = new BufferedWriter(fw1)) {
                for (File list : file2.listFiles()
                ) {
                    bf.write(list.getName() + "\n");

                }


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
}
