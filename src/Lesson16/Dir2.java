package Lesson16;

import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dir2 {


    //Создать файл с текстом, в котором присутствуют числа. Найти все числа,
    //вывести на экран, посчитать сумму, убрать все повторяющиеся числа и снова вывести на экран.
    public static void main(String[] args) {
        File file = new File("text2.txt");
        int sum = 0;
        String marks;
        Pattern number = Pattern.compile("\\d+");


        try (FileWriter fw = new FileWriter("text2.txt")) {
            file.createNewFile();
            fw.write("asdsa 123 sdadas 23 sdasda 33 33 23 123");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try (FileReader fr = new FileReader("text2.txt");
             BufferedReader bfr = new BufferedReader(fr)) {
            marks = bfr.readLine();
            Matcher matcher = number.matcher(marks);
            Set<Integer> set = new HashSet<>();
            while (matcher.find()) {
                sum = sum + Integer.parseInt(matcher.group());
                set.add(Integer.parseInt(matcher.group()));
                System.out.println(matcher.group());
            }
            System.out.println(sum);
            for (Integer element : set
            ) {
                System.out.println(element);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

