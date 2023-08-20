package org.exception.seminars.seminar3.ex7;

import java.io.IOException;

public class ReadFileException extends IOException {
    public ReadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
