package org.exception.seminars.seminar3.ex6;

public class MyArrayDataException extends IllegalArgumentException {
    public MyArrayDataException(int i, int j) {
        super("The problematic element by the [" + i + "], [" + j + "] index");
    }
}
