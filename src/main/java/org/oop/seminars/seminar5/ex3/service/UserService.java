package org.oop.seminars.seminar5.ex3.service;

import org.oop.seminars.seminar5.ex3.model.Student;
import org.oop.seminars.seminar5.ex3.model.Teacher;
import org.oop.seminars.seminar5.ex3.model.Type;
import org.oop.seminars.seminar5.ex3.model.User;

import java.util.List;

public class UserService implements DataService {

    private List<User> userList;

    @Override
    public void create(String name, String surname, String patron, Type type) {
        int id = getFreeId(type);
        if (Type.STUDENT == type) {
            Student student = new Student(name, surname, patron, id);
            userList.add(student);
        }
        if (Type.TEACHER == type) {
            Teacher teacher = new Teacher(name, surname, patron, id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type) {
        int lastId = 0;
        boolean isStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !isStudent) {
                lastId++;
            }
            if (user instanceof Student && isStudent) {
                lastId++;
            }
        }
        return ++lastId;
    }

    @Override
    public List<User> read() {
        return userList;
    }
}