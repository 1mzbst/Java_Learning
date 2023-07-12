package org.oop.seminars.seminar5.ex3.model;

public class Student extends User {
        int studentId;

    public Student(String name, String surname, String otchestvo, int studentId) {
            super(name, surname, otchestvo);
            this.studentId = studentId;
        }

        public int getStudentId() {
            return studentId;
        }

        public void setStudentId(int studentId) {
            this.studentId = studentId;
        }
    }
