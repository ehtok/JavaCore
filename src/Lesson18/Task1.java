package Lesson18;

import java.io.*;

//Записать с помощью Java в двоичный файл 20 случайных чисел.
// Прочитать записанный файл, вывести на экран числа и их среднее арифметическое.
public class Task1 {

    private static final int COUNT = 20;

    public static void main(String[] args) {


        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("text3"))) {
            for (int i = 0; i < COUNT; i++) {
                dos.writeInt((int) (Math.random() * 100 + 1));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        int sum = 0;
        int count = 0;

        try (DataInputStream dis = new DataInputStream(new FileInputStream("text3"))) {
            for (int i = 0; i < COUNT; i++) {
                int x = dis.readInt();
                sum = sum + x;
                System.out.println(x);
                count++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Arithmetic mean = " + (double) sum / count);
    }
}
