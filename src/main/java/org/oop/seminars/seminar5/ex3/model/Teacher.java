package org.oop.seminars.seminar5.ex3.model;

public class Teacher extends User {
        int techerId;

    public Teacher(String name, String surname, String otchestvo, int techerId) {
            super(name, surname, otchestvo);
            this.techerId = techerId;
        }

        public int getTecherId() {
            return techerId;
        }

        public void setTecherId(int techerId) {
            this.techerId = techerId;
        }
    }
