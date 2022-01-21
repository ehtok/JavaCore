package Lesson16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Dir {
    //Вывести список файлов и каталогов выбранного каталога на диске.
    // Файлы и каталоги должны быть распечатаны отдельно.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Directory");
        String dir = sc.nextLine();

        File dir1 = new File(dir);
        if (dir1.isDirectory()) {
            for (File directories : dir1.listFiles()
            ) {
                if (directories.isDirectory()) {
                    System.out.println("Directory name : " + directories.getName());
                } else {
                    System.out.println("File name : " + directories.getName());
                }
            }
        }


    }
}
