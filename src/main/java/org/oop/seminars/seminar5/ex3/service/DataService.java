package org.oop.seminars.seminar5.ex3.service;

import org.oop.seminars.seminar5.ex3.model.Type;
import org.oop.seminars.seminar5.ex3.model.User;

import java.util.List;

public interface DataService {
    void create(String name, String surname, String patron, Type type);

    List<User> read();
}
