package Lesson14.Model;


import java.util.Comparator;
import java.util.Objects;

//Создать класс Student, содержащий следующие характеристики – имя,
// группа, курс, оценки по предметам. Создать коллекцию,
// содержащую объекты класса Student. Написать метод,
// который удаляет студентов со средним баллом <3.
// Если средний балл>=3, студент переводится на следующий курс.
// Напишите метод printStudents(List<Student> students, int course),
// который получает список студентов и номер курса.
// А также печатает на консоль имена тех студентов из списка,
// которые обучаются на данном курсе.
public class Student implements Comparable {
    private String name;
    private String group;
    private int course;
    private double rating;
    static public final int BADRATING= 3;

    public Student(String name, String group, int course, double rating) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, group, course);

        return result;
    }

    @Override
    public int compareTo(Object o) {
        Student student= (Student) o;
        int comare= group.compareTo(student.group);
        if(comare!=0){
            return comare;
        }

        return course-student.course;
    }
}
