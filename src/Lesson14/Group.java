package Lesson14;

import Lesson14.Model.Student;
import Lesson14.Service.StudentService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static Lesson14.Model.Student.BADRATING;

public class Group {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();


        List<Student> students = new ArrayList<>();
        students.add(studentService.createStudent("Петя", "P502",
                studentService.addCourse(), studentService.addRating()));
        students.add(studentService.createStudent("Вася", "P502",
                studentService.addCourse(), studentService.addRating()));
        students.add(studentService.createStudent("Марина", "P502",
                studentService.addCourse(), studentService.addRating()));
        students.add(studentService.createStudent("Егор", "P502",
                studentService.addCourse(), studentService.addRating()));
        students.add(studentService.createStudent("Дима", "P502",
                studentService.addCourse(), studentService.addRating()));
        students.add(studentService.createStudent("Саша", "P502",
                studentService.addCourse(), studentService.addRating()));

        Collections.sort(students);

        studentService.studentsInfo(students);

        studentService.deleteStudents(students);


        studentService.displayStudents(students, 3);




    }


}



