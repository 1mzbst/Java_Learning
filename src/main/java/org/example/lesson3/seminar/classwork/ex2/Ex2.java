package org.example.lesson3.seminar.classwork.ex2;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Student> students = create();

        for (Student student : students) {
            int sumMarks = 0;

            for (int mark : student.getMarks()) {
                sumMarks += mark;
            }

            if (student.getSurname().endsWith("ова") && sumMarks % 2 == 0) {
                System.out.println(student.getSalary());
            }
        }
    }

    public static List<Student> create() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Иванов", 1, 10_000, List.of(3, 4, 5)));
        students.add(new Student("Леонтова", 2, 20_001, List.of(4, 6, 4)));
        students.add(new Student("Гаврилов", 3, 30_000, List.of(2, 4, 3)));
        students.add(new Student("Матросова", 4, 40_004, List.of(3, 4, 3)));

        return students;
    }


}
