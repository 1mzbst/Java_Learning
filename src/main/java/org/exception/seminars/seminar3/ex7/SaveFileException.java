package org.exception.seminars.seminar3.ex7;

import java.io.IOException;

public class SaveFileException extends IOException {
    public SaveFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
