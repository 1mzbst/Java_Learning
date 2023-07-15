package org.oop.seminars.seminar6.ex1;

import java.util.List;

public class JsonFomatter implements Formatter{

    public void formatted(List<Book> books){
        for (Book book : books) {
            System.out.println(book + "была переведена в формат: " + Format.JSON);
        }

    }
}
