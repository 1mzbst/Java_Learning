package org.exception.seminars.seminar3.ex3;

import java.io.IOException;


public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public void add() throws IOException {
        if (closed) {
            throw new IOException("Ресурс закрыт");
        }
        count++;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Закрыли реусурс");
    }

    public boolean isClosed() {
        return closed;
    }

    public int getCount() {
        return count;
    }
}
