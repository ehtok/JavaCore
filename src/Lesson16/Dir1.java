package Lesson16;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dir1 {
    public static void main(String[] args) {


        File file = new File("text.txt");

        String MARKS;

        Pattern marks = Pattern.compile("[.,;!?:]");
        Pattern word = Pattern.compile("\\w+");


        try (
                FileWriter fw = new FileWriter("text.txt")) {
            file.createNewFile();
            fw.write("Hello World!");
        } catch (
                IOException e) {
            e.printStackTrace();
        }

        int countMarks = 0;
        int countWords = 0;


        try (
                FileReader fr = new FileReader("text.txt");
                BufferedReader bfr = new BufferedReader(fr)) {
            while (bfr.ready()) {
                MARKS = bfr.readLine();
                System.out.println(MARKS);
                Matcher matcher = marks.matcher(MARKS);
                while (matcher.find()) {
                    countMarks++;
                }
                Matcher matcher1 = word.matcher(MARKS);
                while (matcher1.find()) {
                    countWords++;

                }
            }
        } catch (
                IOException e) {
            e.printStackTrace();
        }


        System.out.println("Marks count : " + countMarks + " Words count : " + countWords);

    }
}