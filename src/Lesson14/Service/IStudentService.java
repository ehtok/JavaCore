package Lesson14.Service;

import Lesson14.Model.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent(String name, String group, int course, double rating);

    void displayStudents(List<Student> students, int course);

    double addRating();

    int addCourse();

    void deleteStudents(List<Student> students);

    void studentsInfo(List<Student> students);
}


