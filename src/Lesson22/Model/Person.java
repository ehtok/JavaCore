package Lesson22.Model;

import Lesson22.AcademyInfo;

public class Person {
    String name = "Nick";
    int age = 20;

    @AcademyInfo(year = 5)
    public void printPerson() {
        System.out.println("Name person: " + name + "\n"
                + " Age person: " + age);
    }

    public void addAge() {
        System.out.println(age + 1);
    }


}
