package Lesson14.Service;

import Lesson14.Model.Student;

import java.util.Iterator;
import java.util.List;

public class StudentService implements IStudentService {
    @Override
    public Student createStudent(String name, String group, int course, double rating) {
        return new Student(name, group, course, rating);

    }

    @Override
    public void displayStudents(List<Student> students, int course) {
        for (Student student : students
        ) {
            System.out.println(" Имя студента: " + student.getName() +
                    ". Курс студента: " + student.getCourse());

            if (student.getCourse() == course) {
                System.out.println(student.getName() + " Учится на курсе :"
                        + course);
            }

        }
    }

    @Override
    public double addRating() {
        return (double) Math.round((Math.random() * 9) + 1);
    }

    @Override
    public int addCourse() {
        return (int) (Math.random() * 5) + 1;
    }

    @Override
    public void deleteStudents(List<Student> students) {
        Iterator<Student> studentIterator = students.iterator();
        while (studentIterator.hasNext()) {
            Student badRating = studentIterator.next();
            if (badRating.getRating() < Student.BADRATING) {
                studentIterator.remove();
            }
        }


    }

    @Override
    public void studentsInfo(List<Student> students) {
        for (Student info : students
        ) {
            System.out.println("Студент: " + info.getName() +
                    ". Группа: " + info.getGroup() +
                    ". Курс: " + info.getCourse() +
                    ". Средний бал: " + info.getRating());

        }
    }
}
