package org.example.lesson6.classwork.ex4;

public class Farengheit implements Converter{
    @Override
    public double convertValue(double baseValue) {
        return baseValue * 1.8 + 32;
    }
}
